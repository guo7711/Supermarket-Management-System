/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seller;
import buyer.BuyerManage;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rachel
 */
public class SellGoodsManage {
//控制销售表的类
     private Connection con;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private Seller[] seller;
    private int num;

     public void connectDB() throws SQLException, InstantiationException, IllegalAccessException {
//连接数据库
        String userName = "root";
        String userPasswd = "";
        String dbName = "ssms";

        String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SellGoodsManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        con = DriverManager.getConnection(url);
        stmt = con.createStatement();
    }


    public void closeDB() throws SQLException {
        //关闭数据库
        con.close();
    }

     public int setSellerList() throws SQLException {
         //初始化：给Seller赋值
        num = 0;
        rs = stmt.executeQuery("select * from sellinfo");
        while (rs.next())
        {
            num++;
        }
        if (num > 0) {
            seller = new Seller[num];
            rs = stmt.executeQuery("select * from sellinfo");
            for (int i = 0; i < num; i++)
            {
                rs.next();
                seller[i] = new Seller();
                seller[i].setID(rs.getString("GoodsId"));
                seller[i].setName(rs.getString("Name"));
                seller[i].setPrice(rs.getFloat("SellPrice"));
                seller[i].setUserID(rs.getString("UserId"));               
                seller[i].setCount(rs.getInt("Count"));
            }
        }
        return num;
    }


     public Seller[] getSellerArray()
     {
         //获取Seller
         return seller;
     }

     public void saveToDB(String id,String name,int sellcount,String user,float price)
     {
         //增加新购买商品到数据库
        try {
            pstmt = con.prepareStatement("insert into sellinfo values(?,?,?,?,?,?)");
            pstmt.setString(1, id);
            pstmt.setString(2, id);
            pstmt.setString(3, name);
            pstmt.setInt(4, sellcount);
            pstmt.setString(5, user);
            pstmt.setFloat(6, price);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SellGoodsManage.class.getName()).log(Level.SEVERE, null, ex);
        }

     }

     public void delByID(String id)
     {
         //删除一件已购买商品
        try {
            pstmt = con.prepareStatement("delete from sellinfo where GoodsId=?");
            pstmt.setString(1, id);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SellGoodsManage.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

     public void clear()
     {
         //删除全部已购买商品
        try {
            pstmt = con.prepareStatement("delete from sellinfo");
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SellGoodsManage.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

     public String[] getIDList()
     {
         //获取所有商品的ID
         String[] list = new String[10];
         for(int i=0;i<seller.length;i++)
         {
             list[i]=seller[i].getID();
         }
         return list;
     }

     public void addSameProduct(String id,int count)
     { //购买相同商品时增加数量
        try {       
            rs = stmt.executeQuery("select * from sellinfo");
            String getid = "";
            int getcount = 0;
            int newcount = 0;
            while (rs.next()) {
                getid = rs.getString("GoodsId");
                if (id.equals(getid)) {
                    getcount = rs.getInt("Count");
                    newcount = count + getcount;
                    pstmt = con.prepareStatement("update sellinfo set Count=? where GoodsId=?");
                    pstmt.setInt(1, newcount);
                    pstmt.setString(2, id);
                    pstmt.executeUpdate();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SellGoodsManage.class.getName()).log(Level.SEVERE, null, ex);
        }

     }

}
