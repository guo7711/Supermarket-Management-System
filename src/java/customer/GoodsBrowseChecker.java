/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package customer;
import java.sql.*;
import java.util.logging.*;
import manager.Goods;
/**
 *
 * @author Administrator
 */
public class GoodsBrowseChecker {
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private Goods goods;

    public void connectDB() throws SQLException, InstantiationException, IllegalAccessException {
        //连接数据库
        String userName = "root";
        String userPasswd = "";
        String dbName = "ssms";
        String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd+"&useUnicode=true&characterEncoding=UTF-8";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GoodsBrowseChecker.class.getName()).log(Level.SEVERE, null, ex);
        }
        con = DriverManager.getConnection(url);
        stmt = con.createStatement();
    }

    public void closeDB() throws SQLException {
         //关闭连接
        con.close();
    }

     public Goods getSelectGoodsName(String name) throws SQLException {
         //通过name查询数据库并给goods赋值
            rs = stmt.executeQuery("SELECT * FROM GoodsInfo WHERE Name='" +
                    name + "'");
            if (rs.next()) {
                goods=new Goods ();
                goods.setGoodsId(rs.getString("GoodsId"));
                goods.setName( rs.getString("Name"));
                goods.setType( rs.getString("Type"));
                goods.setStockPrice(rs.getString("StockPrice"));
                goods.setSellPrice(rs.getString("SellPrice"));
                goods.setSponsor(rs.getString("Sponsor"));
                goods.setCount(rs.getInt("Count"));
            }
            else return null;
            return goods; //获取goods
    }

    public Goods getSelectGoodsId(String id) throws SQLException {
        //通过Id查询数据库并给goods赋值
            rs = stmt.executeQuery("SELECT * FROM GoodsInfo WHERE GoodsId='" +
                   id + "'");
            if (rs.next())
            {
                goods=new Goods ();
                goods.setGoodsId(rs.getString("GoodsId"));
                goods.setName( rs.getString("Name"));
                goods.setType( rs.getString("Type"));
                goods.setStockPrice(rs.getString("StockPrice"));
                goods.setSellPrice(rs.getString("SellPrice"));
                goods.setSponsor(rs.getString("Sponsor"));
                goods.setCount(rs.getInt("Count"));        
            }
            else return null;
            return goods; //获取goods
    }


}

