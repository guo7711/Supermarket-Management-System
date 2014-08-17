/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author OWNER
 */
//商品类
public class Goods {
//商品ID,商品名，类别，进价，售价，供应商，库存量
    private String goodsId,  name,  type,  stockPrice,  sellPrice,  sponsor;
    private int count;

    public Goods() {
    }

    public void setGoodsId(String gid) {
        goodsId = gid;
    }

    public void setName(String name) {
            this.name = name;      
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStockPrice(String stockPrice) {
        this.stockPrice = stockPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public void setCount(int c) {
        count = c;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getStockPrice() {
        return stockPrice;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public String getSponsor() {
        return sponsor;
    }

    public int getCount() {
        return count;
    }
}
