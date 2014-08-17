/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rachel
 */
public class SellerManage {
        //商品表的控制类
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
            Logger.getLogger(SellerManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        con = DriverManager.getConnection(url);
        stmt = con.createStatement();
    }


    public void closeDB() throws SQLException {
        //关闭数据库
        con.close();
    }

     public int setSellerList() throws SQLException {
         //初始化：为Seller赋值
        num = 0;
        rs = stmt.executeQuery("select * from goodsinfo");
        while (rs.next())
        {
            num++;
        }
        if (num > 0) {
            seller = new Seller[num];
            rs = stmt.executeQuery("select * from goodsinfo");
            for (int i = 0; i < num; i++)
            {
                rs.next();
                seller[i] = new Seller();
                seller[i].setID(rs.getString("GoodsId"));
                seller[i].setName(rs.getString("Name"));
                seller[i].setPrice(rs.getFloat("SellPrice"));
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

     public int[] getCountList()
     {
        //获取数量列表
         int[] list = new int[10];
         for(int i=0;i<seller.length;i++)
         {
             list[i]=seller[i].getCount();
         }
         return list;
     }

     public String[] getIDList()
     {
         //获取ID列表
         String[] list = new String[10];
         for(int i=0;i<seller.length;i++)
         {
             list[i]=seller[i].getID();
         }
         return list;
     }

     public Seller getItemByID(String id)
     {
         //根据ID获取商品信息:已过期
         for(int i=0;i<seller.length;i++)
         {
             if(seller[i].getID().equals(id))
             {
                 return seller[i];
             }
         }
         return null;
     }


      public void saveToDB(String id,int sellcount)
     {
          //销售商品，修改数据库的库存数

        try {
              rs = stmt.executeQuery("select Count from goodsinfo where GoodsId='"+id+"'");
              rs.next();
              int all = Integer.parseInt(rs.getString("Count"));
              //获取库存总数
              int count=all-sellcount;
              //获取销售后的库存数
             pstmt = con.prepareStatement("update goodsinfo set Count='" + count + "' where GoodsId='" + id + "'");
             pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SellGoodsManage.class.getName()).log(Level.SEVERE, null, ex);
        }

     }
      
}
