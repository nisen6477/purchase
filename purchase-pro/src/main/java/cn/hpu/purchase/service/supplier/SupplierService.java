package cn.hpu.purchase.service.supplier;

import cn.hpu.purchase.po.supplier.Supplier;

import java.util.List;

public interface SupplierService {
    int deleteByPrimaryKey(Integer supplierId) throws Exception;

    int insert(Supplier record) throws Exception;

    Supplier selectByPrimaryKey(Integer supplierId) throws Exception;

    List<Supplier> selectAll() throws Exception;

    int updateByPrimaryKey(Supplier record) throws Exception;

    List<Supplier> getSupplierSpinner() throws Exception;
}