package cn.hpu.purchase.controller.base;

import cn.hpu.purchase.po.system.Status;
import cn.hpu.purchase.service.system.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: 倪森森
 * @description:    获取下拉框状态
 * @date: Created in 15:19 2018/3/13
 */
@Controller
@RequestMapping("ba/status/")
public class StatusController {
    @Autowired
    private StatusService statusService;

    /**
     * 获取采购状态
     * */
    @RequestMapping(value = "getPurchaseStatusForSpinner")
    @ResponseBody
    public List<Status> getPurchaseStatusForSpinner(){
        List<Status> purchaseStatusList = null;
        try {
            purchaseStatusList = statusService.getPurchaseStatusForSpinner();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return purchaseStatusList;
    }
}
