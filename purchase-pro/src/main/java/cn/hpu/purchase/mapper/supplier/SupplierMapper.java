package cn.hpu.purchase.mapper.supplier;

import java.util.List;
import cn.hpu.purchase.po.supplier.Supplier;

public interface SupplierMapper {
    int deleteByPrimaryKey(Integer supplierId) throws Exception;

    int insert(Supplier record) throws Exception;

    Supplier selectByPrimaryKey(Integer supplierId) throws Exception;

    List<Supplier> selectAll() throws Exception;

    int updateByPrimaryKey(Supplier record) throws Exception;

    List<Supplier> getSupplierSpinner() throws Exception;
}