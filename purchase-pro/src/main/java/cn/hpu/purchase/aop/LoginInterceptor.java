package cn.hpu.purchase.aop;

import cn.hpu.purchase.po.system.SystemMenu;
import cn.hpu.purchase.po.system.SystemUser;
import cn.hpu.purchase.util.SessionKey;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 倪森森 on 2018/3/09.
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //请求的路径
        String contextPath = request.getContextPath();
        //String url = request.getServletPath().toString();
        HttpSession session = request.getSession();
        SystemUser user = (SystemUser) session.getAttribute(SessionKey.SESSION_ADMIN);
        //这里可以根据session的用户来判断角色的权限，根据权限来重定向不同的页面，简单起见，这里只是做了一个重定向
        if (user != null) {
            List<SystemMenu> leftMenu = (List<SystemMenu>) request.getSession().getAttribute(SessionKey.SESSION_SYSTEM_MENU);
            request.setAttribute("leftMenu", leftMenu);
            return true;
        }
        //如果判断是 AJAX 请求,直接设置为session超时
        if (request.getHeader("x-requested-with") != null && "XMLHttpRequest".equals(request.getHeader("x-requested-with"))) {
            response.setHeader("sessionstatus", "timeout");
        } else {
            //被拦截，重定向到login界面
            response.sendRedirect(contextPath + "/admin/login");
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        if (modelAndView != null) {
            System.out.println("返回了View" + modelAndView.getViewName());
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
