/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seller;

/**
 *
 * @author Rachel
 */
public class Seller {
//商品类
    private String goodsid;
    private String name;
    private int count;
    private String userid;
    private float price;
    private java.util.Date time;

    public String getID()
    {
        return goodsid;
    }

    public void setID(String id)
    {
        goodsid=id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int a)
    {
        count = a;
    }

    public String getUserID()
    {
        return userid;
    }

    public void setUserID(String n)
    {
        userid = n;
    }

    public float getPrice()
    {
        return price;
    }

    public void setPrice(float a)
    {
        price=a;
    }

    public java.util.Date getTime()
    {
        return time;
    }

    public void setTime(java.util.Date t)
    {
        time = t;
    }


}
