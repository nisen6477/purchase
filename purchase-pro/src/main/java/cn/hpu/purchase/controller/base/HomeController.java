package cn.hpu.purchase.controller.base;

import cn.hpu.purchase.service.system.SystemMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author: 倪森森
 * @description: 登陆成功后跳转到系统首页
 * @date: Created in 15:18 2018/3/9
 */
@Controller
@RequestMapping("home")
public class HomeController {
    @Autowired
    private SystemMenuService systemMenuService;
    /**
     * 跳转到系统首页
     *
     * @param
     * @return ModelAndView
     */
    @RequestMapping(value = "index")
    public ModelAndView login(HttpServletRequest request){
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
