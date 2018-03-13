package cn.hpu.purchase.po.storage;

import java.math.BigDecimal;
import java.util.Date;

public class StorageHeader {
    private Integer storageId;

    private String storageCode;

    private Integer accessModeId;

    private Integer storeId;

    private Integer warehouseId;

    private Integer purchaseId;

    private Integer supplierId;

    private Integer itemOwnerId;

    private String checkType;

    private Date checkDate;

    private Date estimateDate;

    private Date confirmDate;

    private Integer confirmBy;

    private Integer refStorageId;

    private String senderName;

    private String senderTel;

    private String senderAddress;

    private String consigneeName;

    private String consigneeEmail;

    private String consigneeTel;

    private String consigneeAddress;

    private String consigneeZipcode;

    private String consigneeDistrictId;

    private String consigneeCityId;

    private String consigneeStateId;

    private Integer consigneeCountryId;

    private Integer statusId;

    private String channelFrom;

    private String customerBillNumber;

    private Integer deliveryTypeId;

    private String hawbNumber;

    private String mawbNumber;

    private String flightNumber;

    private Integer serviceProvider;

    private Integer operationUserId;

    private Integer transferToWarehouseId;

    private BigDecimal totalWeight;

    private BigDecimal totalDeclareValue;

    private Integer declareCurrencyId;

    private String createdBy;

    private Date createdDate;

    private String modifyBy;

    private Date modifyDate;

    private Boolean deleted;

    private String remark;

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public String getStorageCode() {
        return storageCode;
    }

    public void setStorageCode(String storageCode) {
        this.storageCode = storageCode == null ? null : storageCode.trim();
    }

    public Integer getAccessModeId() {
        return accessModeId;
    }

    public void setAccessModeId(Integer accessModeId) {
        this.accessModeId = accessModeId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getItemOwnerId() {
        return itemOwnerId;
    }

    public void setItemOwnerId(Integer itemOwnerId) {
        this.itemOwnerId = itemOwnerId;
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType == null ? null : checkType.trim();
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Date getEstimateDate() {
        return estimateDate;
    }

    public void setEstimateDate(Date estimateDate) {
        this.estimateDate = estimateDate;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public Integer getConfirmBy() {
        return confirmBy;
    }

    public void setConfirmBy(Integer confirmBy) {
        this.confirmBy = confirmBy;
    }

    public Integer getRefStorageId() {
        return refStorageId;
    }

    public void setRefStorageId(Integer refStorageId) {
        this.refStorageId = refStorageId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName == null ? null : senderName.trim();
    }

    public String getSenderTel() {
        return senderTel;
    }

    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel == null ? null : senderTel.trim();
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress == null ? null : senderAddress.trim();
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName == null ? null : consigneeName.trim();
    }

    public String getConsigneeEmail() {
        return consigneeEmail;
    }

    public void setConsigneeEmail(String consigneeEmail) {
        this.consigneeEmail = consigneeEmail == null ? null : consigneeEmail.trim();
    }

    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel == null ? null : consigneeTel.trim();
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress == null ? null : consigneeAddress.trim();
    }

    public String getConsigneeZipcode() {
        return consigneeZipcode;
    }

    public void setConsigneeZipcode(String consigneeZipcode) {
        this.consigneeZipcode = consigneeZipcode == null ? null : consigneeZipcode.trim();
    }

    public String getConsigneeDistrictId() {
        return consigneeDistrictId;
    }

    public void setConsigneeDistrictId(String consigneeDistrictId) {
        this.consigneeDistrictId = consigneeDistrictId == null ? null : consigneeDistrictId.trim();
    }

    public String getConsigneeCityId() {
        return consigneeCityId;
    }

    public void setConsigneeCityId(String consigneeCityId) {
        this.consigneeCityId = consigneeCityId == null ? null : consigneeCityId.trim();
    }

    public String getConsigneeStateId() {
        return consigneeStateId;
    }

    public void setConsigneeStateId(String consigneeStateId) {
        this.consigneeStateId = consigneeStateId == null ? null : consigneeStateId.trim();
    }

    public Integer getConsigneeCountryId() {
        return consigneeCountryId;
    }

    public void setConsigneeCountryId(Integer consigneeCountryId) {
        this.consigneeCountryId = consigneeCountryId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getChannelFrom() {
        return channelFrom;
    }

    public void setChannelFrom(String channelFrom) {
        this.channelFrom = channelFrom == null ? null : channelFrom.trim();
    }

    public String getCustomerBillNumber() {
        return customerBillNumber;
    }

    public void setCustomerBillNumber(String customerBillNumber) {
        this.customerBillNumber = customerBillNumber == null ? null : customerBillNumber.trim();
    }

    public Integer getDeliveryTypeId() {
        return deliveryTypeId;
    }

    public void setDeliveryTypeId(Integer deliveryTypeId) {
        this.deliveryTypeId = deliveryTypeId;
    }

    public String getHawbNumber() {
        return hawbNumber;
    }

    public void setHawbNumber(String hawbNumber) {
        this.hawbNumber = hawbNumber == null ? null : hawbNumber.trim();
    }

    public String getMawbNumber() {
        return mawbNumber;
    }

    public void setMawbNumber(String mawbNumber) {
        this.mawbNumber = mawbNumber == null ? null : mawbNumber.trim();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber == null ? null : flightNumber.trim();
    }

    public Integer getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(Integer serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public Integer getOperationUserId() {
        return operationUserId;
    }

    public void setOperationUserId(Integer operationUserId) {
        this.operationUserId = operationUserId;
    }

    public Integer getTransferToWarehouseId() {
        return transferToWarehouseId;
    }

    public void setTransferToWarehouseId(Integer transferToWarehouseId) {
        this.transferToWarehouseId = transferToWarehouseId;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public BigDecimal getTotalDeclareValue() {
        return totalDeclareValue;
    }

    public void setTotalDeclareValue(BigDecimal totalDeclareValue) {
        this.totalDeclareValue = totalDeclareValue;
    }

    public Integer getDeclareCurrencyId() {
        return declareCurrencyId;
    }

    public void setDeclareCurrencyId(Integer declareCurrencyId) {
        this.declareCurrencyId = declareCurrencyId;
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