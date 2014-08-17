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
//用户管理类
public class PersonManage {

    private Connection con;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private Persons[] persons;
    private int num;

    public PersonManage() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Persons[] getPersons() {
        return persons;
    }

    public Persons getPersons(int index) {
        return persons[index];
    }

    public void setPersons(Persons[] persons) {
        this.persons = persons;
    }

    public void connectDB() throws SQLException, InstantiationException, IllegalAccessException {
        String userName = "root";
        String userPasswd = "";
        String dbName = "ssms";

        String url = "jdbc:mysql://localhost/" + dbName + "?user=" + userName + "&password=" + userPasswd+"&useUnicode=true&characterEncoding=UTF-8";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonManage.class.getName()).log(Level.SEVERE, null, ex);
        }
        con = DriverManager.getConnection(url);
        stmt = con.createStatement();
    }

    public void closeDB() throws SQLException {
        con.close();
    }
//查询用户信息，并返回用户数量
    public int setPersonsList() throws SQLException {
        num = 0;
        rs = stmt.executeQuery("select * from UserInfo");
        while (rs.next()) {
            num++;
        }
        if (num > 0) {
            persons = new Persons[num];
            rs = stmt.executeQuery("select * from UserInfo");
            for (int i = 0; i < num; i++) {
                rs.next();
                persons[i]=new Persons();
                persons[i].setUserId (rs.getString("UserId"));
                persons[i].setUserName(rs.getString("UserName"));
                persons[i].setPrivilege(rs.getInt("Privilege"));
                persons[i].setPassWord(rs.getString("PassWord"));
                persons[i].setTelNumber(rs.getString("TelNumber"));
            }
        }
        return num;
    }
//删除用户
    public void delPerson(Persons p) throws SQLException {
        pstmt = con.prepareStatement("delete from UserInfo where UserId=?");
        pstmt.setString(1, p.getUserId());
        pstmt.executeUpdate();
    }
//添加用户
    public void addPerson(Persons p) throws SQLException {
        pstmt = con.prepareStatement("insert into UserInfo values(?,?,?,?,?)");
        pstmt.setString(1, p.getUserId());
        pstmt.setString(2, p.getUserName());
        pstmt.setInt(3, p.getPrivilege());
        pstmt.setString(4, p.getPassWord());
        pstmt.setString(5, p.getTelNumber());
        pstmt.executeUpdate();
    }
//修改用户
    public void updatePerson(Persons p) throws SQLException {
        pstmt = con.prepareStatement("update UserInfo set Privilege=?,PassWord=?,TelNumber=? where UserId=? and UserName=?");
        pstmt.setInt(1,p.getPrivilege());
        pstmt.setString(2, p.getPassWord());
        pstmt.setString(3, p.getTelNumber());
        pstmt.setString(4, p.getUserId());
        pstmt.setString(5, p.getUserName());
        pstmt.executeUpdate();
    }
}
