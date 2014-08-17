package buyer;

import java.sql.*;
import java.util.logging.Level;

import java.util.logging.Logger;

public class BuyerManage {

    private Connection con;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private Buyer[] Buyer;
    private int num;

    public BuyerManage() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Buyer[] getBuyer() {
        return Buyer;
    }

    public Buyer getBuyer(int index) {
        return Buyer[index];
    }

    public void setBuyer(Buyer[] Buyer) {
        this.Buyer = Buyer;
    }
//连接数据库
    public void connectDB() throws SQLException, InstantiationException, IllegalAccessException {

        String userName = "root";
        String userPasswd = "";
        String dbName = "ssms";

        String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BuyerManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        con = DriverManager.getConnection(url);
        stmt = con.createStatement();
    }
//关闭数据库
    public void closeDB() throws SQLException {
        con.close();
    }
//获取采购信息
    public int setBuyerList() throws SQLException {
        num = 0;
        rs = stmt.executeQuery("select * from buyer");
        while (rs.next()) {
            num++;
        }
        if (num > 0) {
            Buyer = new Buyer[num];
            rs = stmt.executeQuery("select * from buyer");
            for (int i = 0; i < num; i++) {
                rs.next();
                Buyer[i] = new Buyer();
                Buyer[i].setGoodsID(rs.getString("goodsId"));
                Buyer[i].setCount(rs.getInt("count"));
            }
        }
        return num;
    }
    //获取采购商品id
     public void setBuyerGoodsId() throws SQLException {
        num = 0;
        rs = stmt.executeQuery("select * from buyer");
        while (rs.next()) {
            num++;
        }
        if (num > 0) {
            Buyer = new Buyer[num];
            rs = stmt.executeQuery("select * from buyer");
            for (int i = 0; i < num; i++) {
                rs.next();
                Buyer[i] = new Buyer();
                Buyer[i].setGoodsID(rs.getString("goodsId"));
               
            }
        }
      
    }
//更新采购表
    public void updateBuyer(String z,int g) throws SQLException {
        pstmt = con.prepareStatement("update buyer set Count='"+g+"' where GoodsId='"+z+"'");
        
        pstmt.executeUpdate();
    }
    //更新商品信息表
     public void updateGoodsInfo(String z,int g) throws SQLException {
        pstmt = con.prepareStatement("update goodsinfo set Count='"+g+"' where GoodsId='"+z+"'");

        pstmt.executeUpdate();
    }
}

