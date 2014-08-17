/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.sql.*;
import java.util.logging.*;
import manager.Persons;

/**
 *
 * @author Administrator
 */
public class PersonsChecker {

    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private Persons persons;

    public void connectDB() throws SQLException, InstantiationException, IllegalAccessException {
        //连接数据库
        String userName = "root";
        String userPasswd = "";
        String dbName = "ssms";

        String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd + "&useUnicode=true&characterEncoding=UTF-8";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonsChecker.class.getName()).log(Level.SEVERE, null, ex);
        }
        con = DriverManager.getConnection(url);
        stmt = con.createStatement();
    }

    public void closeDB() throws SQLException {
        //关闭连接
        con.close();
    }

    public Persons getSelectCustomer(String id) throws SQLException {
        //查询数据库给persons赋值
        persons = new Persons();
        rs = stmt.executeQuery("SELECT * FROM UserInfo WHERE UserId='" +
                id + "' AND Privilege=4");
        if (rs.next()) {
            persons.setUserName(rs.getString("UserName"));
            persons.setTelNumber(rs.getString("TelNumber"));
            persons.setPassWord(rs.getString("Password"));
        }
        return persons;//获取persons
    }

    public int validate(Persons persons) throws SQLException {
        //验证登陆合法性
        int destination = 0;
        rs = stmt.executeQuery("SELECT * FROM UserInfo WHERE UserId='" +
                persons.getUserId() + "' AND Password='" +
                persons.getPassWord() + "'");
        if (rs.next()) {
            int p = rs.getInt("Privilege");
            if (p == 1) {
                destination = 1;
            } else if (p == 2) {
                destination = 2;
            } else if (p == 3) {
                destination = 3;
            } else if (p == 4) {
                destination = 4;
            }
        } else {
            destination = 5;
        }
        return destination; //获取destination
    }
}
