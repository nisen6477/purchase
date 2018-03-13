package cn.hpu.purchase.po.purchase;

public class PurchaseType {
    private Integer purchaseTypeId;

    private String purchaseTypeCode;

    private String purchaseTypeName;

    private Integer serialNo;

    private String remark;

    public Integer getPurchaseTypeId() {
        return purchaseTypeId;
    }

    public void setPurchaseTypeId(Integer purchaseTypeId) {
        this.purchaseTypeId = purchaseTypeId;
    }

    public String getPurchaseTypeCode() {
        return purchaseTypeCode;
    }

    public void setPurchaseTypeCode(String purchaseTypeCode) {
        this.purchaseTypeCode = purchaseTypeCode == null ? null : purchaseTypeCode.trim();
    }

    public String getPurchaseTypeName() {
        return purchaseTypeName;
    }

    public void setPurchaseTypeName(String purchaseTypeName) {
        this.purchaseTypeName = purchaseTypeName == null ? null : purchaseTypeName.trim();
    }

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}