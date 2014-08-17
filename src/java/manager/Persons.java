/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author OWNER
 */
//用户类
public class Persons {
//权限，用户名，用户ID，用户密码，电话号码
    private int privilege;
    private String userName,  userId,  passWord,  telNumber;

    public Persons() {
    }

    public void setTelNumber(String tn) {
        telNumber = tn;
    }

    public void setPassWord(String pw) {
        passWord = pw;
    }

    public void setPrivilege(int p) {
        privilege = p;
    }

    public void setUserName(String un) {
            this.userName = un;        
    }

    public void setUserId(String uid) {
        userId = uid;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getPrivilege() {
        return privilege;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getPassWord() {
        return passWord;
    }
}
