package cn.hpu.purchase.controller.system;

import cn.hpu.purchase.service.system.SystemMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author: 倪森森
 * @description:
 * @date: Created in 16:21 2018/3/9
 */
@Controller
@RequestMapping("ba/home")
public class SystemMenuController {
    @Autowired
    private SystemMenuService systemMenuService;

    @RequestMapping(value = "/index")
    public ModelAndView toIndex(HttpServletRequest request){
        System.out.println("111111111111111111111111");
        ModelAndView mv = new ModelAndView();
        try {
            Map<String, Object> map = systemMenuService.getUserSystemMenu(request);
            mv.addObject("leftMenu",map.get("leftMenu"));
            mv.setViewName("system/purchase/index");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
}
