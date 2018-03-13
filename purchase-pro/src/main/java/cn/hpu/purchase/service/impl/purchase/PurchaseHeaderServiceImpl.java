package cn.hpu.purchase.service.impl.purchase;

import cn.hpu.purchase.mapper.purchase.PurchaseHeaderMapper;
import cn.hpu.purchase.po.purchase.PurchaseHeader;
import cn.hpu.purchase.po.purchase.PurchaseType;
import cn.hpu.purchase.pojo.purchase.PurchaseCustomer;
import cn.hpu.purchase.pojo.purchase.PurchaseRank;
import cn.hpu.purchase.service.purchase.PurchaseHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: 倪森森
 * @description: 查询采购单相关信息及首页排行和采购量信息
 * @date: Created in 10:46 2018/3/13
 */
@Service
public class PurchaseHeaderServiceImpl implements PurchaseHeaderService {

    @Autowired
    private PurchaseHeaderMapper purchaseHeaderMapper;

    @Override
    public int insert(PurchaseHeader record) throws Exception {
        return 0;
    }

    @Override
    public PurchaseHeader selectByPrimaryKey(Integer purchaseId) throws Exception {
        return null;
    }

    @Override
    public List<PurchaseHeader> selectAll() throws Exception {
        return null;
    }

    @Override
    public int updateByPrimaryKey(PurchaseHeader record) throws Exception {
        return 0;
    }

    @Override
    public Map<String,List<PurchaseRank>> getPurchaseRankTopTen() throws Exception {
        Map map = new HashMap<String, String>();
        map.put("status","amount");
        List<PurchaseRank> purchaseRankAmountTopTen = purchaseHeaderMapper.getPurchaseRankTopTen(map);
        map.put("status","quantity");
        List<PurchaseRank> purchaseRankQuantityTopTen = purchaseHeaderMapper.getPurchaseRankTopTen(map);
        map.put("amount",purchaseRankAmountTopTen);
        map.put("quantity",purchaseRankQuantityTopTen);
        return map;
    }

    @Override
    public BigDecimal getPurchaseTotalAmount() throws Exception {
        return purchaseHeaderMapper.getPurchaseTotalAmount();
    }

    @Override
    public BigDecimal getPurchaseProductTotalQuantity() throws Exception {
        return purchaseHeaderMapper.getPurchaseProductTotalQuantity();
    }

    @Override
    public Integer getPurchaseHeaderQuantity() throws Exception {
        return purchaseHeaderMapper.getPurchaseHeaderQuantity();
    }

    @Override
    public List<PurchaseType> getPurchaseTypeForSpinner() throws Exception {
        return purchaseHeaderMapper.getPurchaseTypeForSpinner();
    }

    @Override
    public List<PurchaseCustomer> getPurchasePage() throws Exception {
        Map map = new HashMap();
        List<PurchaseCustomer> purchasePage = purchaseHeaderMapper.getPurchasePage(map);
        return purchasePage;
    }

}
