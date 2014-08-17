/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buyer;

/**
 *
 * @author cnu
 */
public class Buyer {
//商品的id
    private String goodsId;
    //商品数目
    private int count;

    
    public void setGoodsID(String goodsId) {
        this.goodsId = goodsId;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public int getCount() {
        return count;
    }
}
