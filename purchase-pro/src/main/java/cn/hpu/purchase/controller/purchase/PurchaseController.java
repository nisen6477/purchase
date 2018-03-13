package cn.hpu.purchase.controller.purchase;

import cn.hpu.purchase.po.purchase.PurchaseType;
import cn.hpu.purchase.pojo.purchase.PurchaseCustomer;
import cn.hpu.purchase.service.purchase.PurchaseHeaderService;
import cn.hpu.purchase.service.storage.StorageHeaderService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: 倪森森
 * @description:
 * @date: Created in 9:50 2018/3/13
 */
@Controller
@RequestMapping("pu/purchase/")
public class PurchaseController {
    @Autowired
    private PurchaseHeaderService purchaseHeaderService;

    @Autowired
    private StorageHeaderService storageHeaderService;

    /**
     * 根据采购数量或者采购金额获取采购排行前十的商品
     * */
    @RequestMapping(value = "get_purchase_rank_top_ten")
    @ResponseBody
    public Map getPurchaseRankTopTen() {
        Map map = new HashMap();
        try {
            map = purchaseHeaderService.getPurchaseRankTopTen();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 获取首页制表信息以及统计采购总金额，采购商品数等信息
     * */
    @RequestMapping(value = "get_purchase_chart_and_other_msg")
    @ResponseBody
    public Map getPurchaseChartAndOtherMsg() {
        Map map = new HashMap();
        try {
            BigDecimal purchaseAmount = purchaseHeaderService.getPurchaseTotalAmount();
            BigDecimal purchaseTotalQuantity = purchaseHeaderService.getPurchaseProductTotalQuantity();
            Integer totalQuantity = purchaseHeaderService.getPurchaseHeaderQuantity();
            Integer storageQuantity = storageHeaderService.getStorageHeaderQuantity();
            map.put("purchaseAmount",purchaseAmount);
            map.put("purchaseTotalQuantity",purchaseTotalQuantity);
            map.put("totalQuantity",totalQuantity);
            map.put("storageQuantity",storageQuantity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 跳转到采购单管理页面
     * */
    @RequestMapping(value = "list")
    public ModelAndView toPurchasePage() {
        ModelAndView mv = new ModelAndView("system/purchase/purchase_list");
        return mv;
    }

    /**
     * 获取采购单类型下拉列表
     * */
    @RequestMapping(value = "purchase_type")
    @ResponseBody
    public List<PurchaseType> getPurchaseTypeForSpinner(){
        try {
            List<PurchaseType> purchaseTypeList = purchaseHeaderService.getPurchaseTypeForSpinner();
            return purchaseTypeList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "get_purchase_Page")
    @ResponseBody
    public Map getPurchasePage() {
        PageHelper.startPage(1, 10);
        Map map = new HashMap();
        try {
            List<PurchaseCustomer> purchasePage = purchaseHeaderService.getPurchasePage();
            map.put("pageData",purchasePage);
            int currentPage = 1;
            map.put("pageInfo",currentPage);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
