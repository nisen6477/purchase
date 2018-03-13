package cn.hpu.purchase.po.product;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Integer productId;

    private String productName;

    private Integer productTypeId;

    private String sku;

    private String barcode;

    private String hsCode;

    private Integer packageTypeId;

    private Integer brandId;

    private Integer manufacturerId;

    private Integer shipperId;

    private String keyWords;

    private String descriptionShort;

    private BigDecimal priceSale;

    private BigDecimal priceMarket;

    private BigDecimal priceSuggest;

    private BigDecimal priceCost;

    private Integer currencyId;

    private BigDecimal weightNet;

    private BigDecimal weightGross;

    private Boolean isDeliveryFree;

    private BigDecimal deliveryCostAdded;

    private BigDecimal stockVirtual;

    private BigDecimal stockWarning;

    private BigDecimal stockSafe;

    private Integer storageLifeDays;

    private Boolean isPublished;

    private Boolean isLotNumberControl;

    private Boolean isSyncStockVirtual;

    private Boolean isGroupBuying;

    private Boolean isIdentityCardNeed;

    private Boolean isReturnSupported;

    private Boolean isRedPacket;

    private String declareName;

    private BigDecimal declareValue;

    private Integer declareCurrencyId;

    private Integer statusId;

    private String createdBy;

    private Date createdDate;

    private String modifyBy;

    private Date modifyDate;

    private Boolean deleted;

    private String remark;

    private String descriptionDetail;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getHsCode() {
        return hsCode;
    }

    public void setHsCode(String hsCode) {
        this.hsCode = hsCode == null ? null : hsCode.trim();
    }

    public Integer getPackageTypeId() {
        return packageTypeId;
    }

    public void setPackageTypeId(Integer packageTypeId) {
        this.packageTypeId = packageTypeId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public Integer getShipperId() {
        return shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords == null ? null : keyWords.trim();
    }

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort == null ? null : descriptionShort.trim();
    }

    public BigDecimal getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(BigDecimal priceSale) {
        this.priceSale = priceSale;
    }

    public BigDecimal getPriceMarket() {
        return priceMarket;
    }

    public void setPriceMarket(BigDecimal priceMarket) {
        this.priceMarket = priceMarket;
    }

    public BigDecimal getPriceSuggest() {
        return priceSuggest;
    }

    public void setPriceSuggest(BigDecimal priceSuggest) {
        this.priceSuggest = priceSuggest;
    }

    public BigDecimal getPriceCost() {
        return priceCost;
    }

    public void setPriceCost(BigDecimal priceCost) {
        this.priceCost = priceCost;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public BigDecimal getWeightNet() {
        return weightNet;
    }

    public void setWeightNet(BigDecimal weightNet) {
        this.weightNet = weightNet;
    }

    public BigDecimal getWeightGross() {
        return weightGross;
    }

    public void setWeightGross(BigDecimal weightGross) {
        this.weightGross = weightGross;
    }

    public Boolean getIsDeliveryFree() {
        return isDeliveryFree;
    }

    public void setIsDeliveryFree(Boolean isDeliveryFree) {
        this.isDeliveryFree = isDeliveryFree;
    }

    public BigDecimal getDeliveryCostAdded() {
        return deliveryCostAdded;
    }

    public void setDeliveryCostAdded(BigDecimal deliveryCostAdded) {
        this.deliveryCostAdded = deliveryCostAdded;
    }

    public BigDecimal getStockVirtual() {
        return stockVirtual;
    }

    public void setStockVirtual(BigDecimal stockVirtual) {
        this.stockVirtual = stockVirtual;
    }

    public BigDecimal getStockWarning() {
        return stockWarning;
    }

    public void setStockWarning(BigDecimal stockWarning) {
        this.stockWarning = stockWarning;
    }

    public BigDecimal getStockSafe() {
        return stockSafe;
    }

    public void setStockSafe(BigDecimal stockSafe) {
        this.stockSafe = stockSafe;
    }

    public Integer getStorageLifeDays() {
        return storageLifeDays;
    }

    public void setStorageLifeDays(Integer storageLifeDays) {
        this.storageLifeDays = storageLifeDays;
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public Boolean getIsLotNumberControl() {
        return isLotNumberControl;
    }

    public void setIsLotNumberControl(Boolean isLotNumberControl) {
        this.isLotNumberControl = isLotNumberControl;
    }

    public Boolean getIsSyncStockVirtual() {
        return isSyncStockVirtual;
    }

    public void setIsSyncStockVirtual(Boolean isSyncStockVirtual) {
        this.isSyncStockVirtual = isSyncStockVirtual;
    }

    public Boolean getIsGroupBuying() {
        return isGroupBuying;
    }

    public void setIsGroupBuying(Boolean isGroupBuying) {
        this.isGroupBuying = isGroupBuying;
    }

    public Boolean getIsIdentityCardNeed() {
        return isIdentityCardNeed;
    }

    public void setIsIdentityCardNeed(Boolean isIdentityCardNeed) {
        this.isIdentityCardNeed = isIdentityCardNeed;
    }

    public Boolean getIsReturnSupported() {
        return isReturnSupported;
    }

    public void setIsReturnSupported(Boolean isReturnSupported) {
        this.isReturnSupported = isReturnSupported;
    }

    public Boolean getIsRedPacket() {
        return isRedPacket;
    }

    public void setIsRedPacket(Boolean isRedPacket) {
        this.isRedPacket = isRedPacket;
    }

    public String getDeclareName() {
        return declareName;
    }

    public void setDeclareName(String declareName) {
        this.declareName = declareName == null ? null : declareName.trim();
    }

    public BigDecimal getDeclareValue() {
        return declareValue;
    }

    public void setDeclareValue(BigDecimal declareValue) {
        this.declareValue = declareValue;
    }

    public Integer getDeclareCurrencyId() {
        return declareCurrencyId;
    }

    public void setDeclareCurrencyId(Integer declareCurrencyId) {
        this.declareCurrencyId = declareCurrencyId;
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

    public String getDescriptionDetail() {
        return descriptionDetail;
    }

    public void setDescriptionDetail(String descriptionDetail) {
        this.descriptionDetail = descriptionDetail == null ? null : descriptionDetail.trim();
    }
}