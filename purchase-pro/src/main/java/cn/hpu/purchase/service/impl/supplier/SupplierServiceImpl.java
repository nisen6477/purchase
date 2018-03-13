package cn.hpu.purchase.service.impl.supplier;

import cn.hpu.purchase.mapper.supplier.SupplierMapper;
import cn.hpu.purchase.po.supplier.Supplier;
import cn.hpu.purchase.service.supplier.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 倪森森
 * @description:
 * @date: Created in 14:12 2018/3/13
 */
@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public int deleteByPrimaryKey(Integer supplierId) throws Exception {
        return 0;
    }

    @Override
    public int insert(Supplier record) throws Exception {
        return 0;
    }

    @Override
    public Supplier selectByPrimaryKey(Integer supplierId) throws Exception {
        return null;
    }

    @Override
    public List<Supplier> selectAll() throws Exception {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Supplier record) throws Exception {
        return 0;
    }

    @Override
    public List<Supplier> getSupplierSpinner() throws Exception {
        return supplierMapper.getSupplierSpinner();
    }
}
