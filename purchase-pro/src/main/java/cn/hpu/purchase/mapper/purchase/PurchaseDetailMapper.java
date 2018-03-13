package cn.hpu.purchase.mapper.purchase;

import java.util.List;
import cn.hpu.purchase.po.purchase.PurchaseDetail;

public interface PurchaseDetailMapper {

    int insert(PurchaseDetail record) throws Exception;

    PurchaseDetail selectByPrimaryKey(Integer purchaseDetailId) throws Exception;

    List<PurchaseDetail> selectAll() throws Exception;

    int updateByPrimaryKey(PurchaseDetail record) throws Exception;
}