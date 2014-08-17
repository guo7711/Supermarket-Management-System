/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author OWNER
 */
//商品管理类
public class GoodsManage {

    private Connection con;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private Goods[] goods;
    private int num;

    public GoodsManage() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public Goods getGoods(int index) {
        return goods[index];
    }

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }
//连接MYSQL数据库，数据库名SSMS
    public void connectDB() throws SQLException, InstantiationException, IllegalAccessException {
        String userName = "root";
        String userPasswd = "";
        String dbName = "ssms";

        String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd + "&useUnicode=true&characterEncoding=UTF-8";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GoodsManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        con = DriverManager.getConnection(url);
        stmt = con.createStatement();
    }

    public void closeDB() throws SQLException {
        con.close();
    }
//按名退货
    public boolean nameReturn(String n, int c) throws SQLException {
        String name;
        int count = 0;
        rs = stmt.executeQuery("select * from GoodsInfo");
        while (rs.next()) {
            name = rs.getString("Name");
            if (name.equals(n)) {
                count = rs.getInt("Count");
                count = count + c;
                pstmt = con.prepareStatement("update GoodsInfo set Count=? where Name=?");
                pstmt.setInt(1, count);
                pstmt.setString(2, n);
                pstmt.executeUpdate();
                return true;
            }
        }
        return false;
    }
//按ID退货
    public boolean idReturn(String g, int c) throws SQLException {
        String id;
        int count = 0;
        rs = stmt.executeQuery("select * from GoodsInfo");
        while (rs.next()) {
            id = rs.getString("GoodsId");
            if (id.equals(g)) {
                count = rs.getInt("Count");
                count = count + c;
                pstmt = con.prepareStatement("update GoodsInfo set Count=? where GoodsId=?");
                pstmt.setInt(1, count);
                pstmt.setString(2, g);
                pstmt.executeUpdate();
                return true;
            }
        }
        return false;
    }
//查询商品并返回商品数量
    public int setGoodsList() throws SQLException {
        num = 0;
        rs = stmt.executeQuery("select * from GoodsInfo");
        while (rs.next()) {
            num++;
        }
        if (num > 0) {
            goods = new Goods[num];
            rs = stmt.executeQuery("select * from GoodsInfo");
            for (int i = 0; i < num; i++) {
                rs.next();
                goods[i] = new Goods();
                goods[i].setGoodsId(rs.getString("GoodsId"));
                goods[i].setName(rs.getString("Name"));
                goods[i].setType(rs.getString("Type"));
                goods[i].setStockPrice(rs.getString("StockPrice"));
                goods[i].setSellPrice(rs.getString("SellPrice"));
                goods[i].setSponsor(rs.getString("Sponsor"));
                goods[i].setCount(rs.getInt("Count"));
            }
        }
        return num;
    }
//从总表中删除商品
    public void delGoods(Goods g) throws SQLException {
        pstmt = con.prepareStatement("delete from GoodsInfo where GoodsId=?");
        pstmt.setString(1, g.getGoodsId());
        pstmt.executeUpdate();
    }
//从采购表中删除商品
    public void delBuyerList(Goods g) throws SQLException {
        pstmt = con.prepareStatement("delete from Buyer where GoodsId=?");
        pstmt.setString(1, g.getGoodsId());
        pstmt.executeUpdate();
    }
//在总表中添加商品
    public void addGoods(Goods g) throws SQLException {
        pstmt = con.prepareStatement("insert into GoodsInfo values(?,?,?,?,?,?,?)");
        pstmt.setString(1, g.getGoodsId());
        pstmt.setString(2, g.getName());
        pstmt.setString(3, g.getType());
        pstmt.setString(4, g.getStockPrice());
        pstmt.setString(5, g.getSellPrice());
        pstmt.setString(6, g.getSponsor());
        pstmt.setInt(7, g.getCount());
        pstmt.executeUpdate();
    }
//在采购表中添加商品
    public void addBuyerList(Goods g) throws SQLException {
        pstmt = con.prepareStatement("insert into Buyer values(?,?)");
        pstmt.setString(1, g.getGoodsId());
        pstmt.setInt(2, g.getCount());
        pstmt.executeUpdate();
    }
//修改总表商品信息
    public void updateGoods(Goods g) throws SQLException {
        pstmt = con.prepareStatement("update GoodsInfo set Type=?,StockPrice=?,SellPrice=?,Sponsor=?,Count=? where GoodsId=? and Name=?");
        pstmt.setString(1, g.getType());
        pstmt.setString(2, g.getStockPrice());
        pstmt.setString(3, g.getSellPrice());
        pstmt.setString(4, g.getSponsor());
        pstmt.setInt(5, g.getCount());
        pstmt.setString(6, g.getGoodsId());
        pstmt.setString(7, g.getName());
        pstmt.executeUpdate();
    }
//修改采购表商品信息
    public void updateBuyerList(Goods g) throws SQLException {
        pstmt = con.prepareStatement("update buyer set Count=? where GoodsId=?");
        pstmt.setInt(1, g.getCount());
        pstmt.setString(2, g.getGoodsId());
        pstmt.executeUpdate();
    }
}
