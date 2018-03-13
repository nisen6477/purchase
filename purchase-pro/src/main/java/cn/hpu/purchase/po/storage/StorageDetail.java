package cn.hpu.purchase.po.storage;

import java.math.BigDecimal;
import java.util.Date;

public class StorageDetail {
    private Integer storageDetailId;

    private Integer storageId;

    private Integer purchaseDetailId;

    private Integer orderAuditDetailId;

    private Integer productId;

    private String lotNumber;

    private Date manufactureDate;

    private Date expireDate;

    private BigDecimal quantity;

    private BigDecimal quantityOut;

    private BigDecimal quantityIntending;

    private Integer packageTypeId;

    private BigDecimal weight;

    private BigDecimal price;

    private BigDecimal amount;

    private Integer currencyId;

    private Integer inventoryId;

    private Integer refStorageDetailId;

    private Boolean isDamaged;

    private Integer statusId;

    private String createdBy;

    private Date createdDate;

    private String modifyBy;

    private Date modifyDate;

    private Boolean deleted;

    private String remark;

    public Integer getStorageDetailId() {
        return storageDetailId;
    }

    public void setStorageDetailId(Integer storageDetailId) {
        this.storageDetailId = storageDetailId;
    }

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public Integer getPurchaseDetailId() {
        return purchaseDetailId;
    }

    public void setPurchaseDetailId(Integer purchaseDetailId) {
        this.purchaseDetailId = purchaseDetailId;
    }

    public Integer getOrderAuditDetailId() {
        return orderAuditDetailId;
    }

    public void setOrderAuditDetailId(Integer orderAuditDetailId) {
        this.orderAuditDetailId = orderAuditDetailId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber == null ? null : lotNumber.trim();
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getQuantityOut() {
        return quantityOut;
    }

    public void setQuantityOut(BigDecimal quantityOut) {
        this.quantityOut = quantityOut;
    }

    public BigDecimal getQuantityIntending() {
        return quantityIntending;
    }

    public void setQuantityIntending(BigDecimal quantityIntending) {
        this.quantityIntending = quantityIntending;
    }

    public Integer getPackageTypeId() {
        return packageTypeId;
    }

    public void setPackageTypeId(Integer packageTypeId) {
        this.packageTypeId = packageTypeId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Integer getRefStorageDetailId() {
        return refStorageDetailId;
    }

    public void setRefStorageDetailId(Integer refStorageDetailId) {
        this.refStorageDetailId = refStorageDetailId;
    }

    public Boolean getIsDamaged() {
        return isDamaged;
    }

    public void setIsDamaged(Boolean isDamaged) {
        this.isDamaged = isDamaged;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}