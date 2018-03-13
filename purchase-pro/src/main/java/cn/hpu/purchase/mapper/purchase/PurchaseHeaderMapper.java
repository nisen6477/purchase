package cn.hpu.purchase.mapper.purchase;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import cn.hpu.purchase.po.purchase.PurchaseHeader;
import cn.hpu.purchase.po.purchase.PurchaseType;
import cn.hpu.purchase.pojo.purchase.PurchaseCustomer;
import cn.hpu.purchase.pojo.purchase.PurchaseRank;

public interface PurchaseHeaderMapper {

    int insert(PurchaseHeader record) throws Exception;

    PurchaseHeader selectByPrimaryKey(Integer purchaseId) throws Exception;

    List<PurchaseHeader> selectAll() throws Exception;

    int updateByPrimaryKey(PurchaseHeader record) throws Exception;

    List<PurchaseRank> getPurchaseRankTopTen(Map<String,String> map) throws Exception;

    BigDecimal getPurchaseTotalAmount() throws Exception;

    BigDecimal getPurchaseProductTotalQuantity() throws Exception;

    Integer getPurchaseHeaderQuantity() throws Exception;

    List<PurchaseType> getPurchaseTypeForSpinner() throws Exception;

    List<PurchaseCustomer> getPurchasePage(Map map) throws Exception;
}