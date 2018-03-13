package cn.hpu.purchase.controller.supplier;

import cn.hpu.purchase.po.supplier.Supplier;
import cn.hpu.purchase.service.supplier.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: 倪森森
 * @description:    供应商相关查询
 * @date: Created in 14:14 2018/3/13
 */
@Controller
@RequestMapping("pu/supplier/")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    /**
     * 获取供应商下拉列表
     * */
    @RequestMapping(value = "get_supplier")
    @ResponseBody
    public List<Supplier> getSupplierSpinner(){
        try {
            List<Supplier> supperNameList = supplierService.getSupplierSpinner();
            return supperNameList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
