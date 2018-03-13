package cn.hpu.purchase.service.purchase;

import cn.hpu.purchase.po.purchase.PurchaseHeader;
import cn.hpu.purchase.po.purchase.PurchaseType;
import cn.hpu.purchase.pojo.purchase.PurchaseCustomer;
import cn.hpu.purchase.pojo.purchase.PurchaseRank;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface PurchaseHeaderService {

    int insert(PurchaseHeader record) throws Exception;

    PurchaseHeader selectByPrimaryKey(Integer purchaseId) throws Exception;

    List<PurchaseHeader> selectAll() throws Exception;

    int updateByPrimaryKey(PurchaseHeader record) throws Exception;

    /**
     * 获取采购排行TOP10
     * */
    Map<String,List<PurchaseRank>> getPurchaseRankTopTen() throws Exception;

    /**
     * 获取采购总金额
     * */
    BigDecimal getPurchaseTotalAmount() throws Exception;

    /**
     * 获取采购商品总数量
     * */
    BigDecimal getPurchaseProductTotalQuantity() throws Exception;

    /**
     * 获取采购单数量
     * */
    Integer getPurchaseHeaderQuantity() throws Exception;

    /**
     * 获取采购类型下拉列表
     * */
    List<PurchaseType> getPurchaseTypeForSpinner() throws Exception;

    /**
     * 获取采购单管理页面列表信息
     * */
    List<PurchaseCustomer> getPurchasePage() throws Exception;
}