package cn.hpu.purchase.util.excel.report;

import cn.hpu.purchase.util.ExcelDesc;

/**
 * Created by LeonLee on 2018/2/9.
 */
public class SystemActionExcel {
    @ExcelDesc(value = "操作人" ,orderBy = "1")
    public String firstName;
    @ExcelDesc(value = "操作时间" ,orderBy = "2")
    public String createdDate;
    @ExcelDesc(value = "IP" ,orderBy = "3")
    public String ipAddress;
    @ExcelDesc(value = "商城名称" ,orderBy = "4")
    public String storeName;
    @ExcelDesc(value = "操作记录" ,orderBy = "5")
    public String description;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
