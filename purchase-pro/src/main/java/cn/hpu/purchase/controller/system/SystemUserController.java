package cn.hpu.purchase.controller.system;

import cn.hpu.purchase.controller.base.BaseController;
import cn.hpu.purchase.po.system.SystemUser;
import cn.hpu.purchase.service.system.SystemUserService;
import cn.hpu.purchase.util.ResponseMessage;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: 倪森森
 * @description:
 * @date: Created in 16:01 2018/3/8
 */
@Controller
@RequestMapping("admin")
public class SystemUserController extends BaseController {

    @Autowired
    private SystemUserService systemUserService;

    /**
     * 跳转到登陆页面
     *
     * @param
     * @return ModelAndView
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ModelAndView login() throws Exception{
        ModelAndView mv = new ModelAndView("system/public/login");
        return mv;
    }

    /**
     * 处理登录请求
     *
     * @param username 用户名
     * @param password 密码
     * @param request 用于再service层再session中存入登陆用户
     * @return
     */
    @RequestMapping(value = "check_login", method = RequestMethod.POST)
    @ResponseBody
    public Map checkLogin(@RequestParam(value = "username") String username,
                          @RequestParam(value = "password") String password,
                          HttpServletRequest request) {
        Map<String,String> map = new HashMap<>();
        try {
            SystemUser systemUser = systemUserService.getSystemUser(username, password, request);
            if (systemUser != null){
                map.put("message", "success");
                return map;
            } else {
                map.put("message", ResponseMessage.LOGIN_ERROR);
            }
        } catch (Exception e) {
            map.put("message", ResponseMessage.LOGIN_ERROR);
            e.printStackTrace();
        }
        return map;
    }

}
