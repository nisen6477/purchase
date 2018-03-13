package cn.hpu.purchase.pojo.purchase;

/**
 * @author: 倪森森
 * @description: 用于查询销量排行以及销售金额排行   PurchaseHeaderMapper.xml
 * @date: Created in 10:24 2018/3/13
 */

public class PurchaseRank {

    private String sku;

    private String productName;

    private String quantity;
    
    private String amount;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
