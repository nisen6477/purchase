package cn.hpu.purchase.service.impl.system;

import cn.hpu.purchase.mapper.system.SystemMenuMapper;
import cn.hpu.purchase.po.system.SystemMenu;
import cn.hpu.purchase.po.system.SystemUser;
import cn.hpu.purchase.service.system.SystemMenuService;
import cn.hpu.purchase.util.SessionKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: 倪森森
 * @description: 系统菜单相关
 * @date: Created in 11:56 2018/3/9
 */
@Service
public class SystemMenuServiceImpl implements SystemMenuService {

    @Autowired
    private SystemMenuMapper systemMenuMapper;

    @Override
    public int insert(SystemMenu record) throws Exception {
        return 0;
    }

    @Override
    public SystemMenu selectByPrimaryKey(Integer systemMenuId) throws Exception {
        return null;
    }

    @Override
    public int updateByPrimaryKey(SystemMenu record) throws Exception {
        return 0;
    }

    @Override
    public List<SystemMenu> getSystemMenuBySystemIDAndSystemUserID(Integer systemID, Integer systemUserID) throws Exception {
        Map map = new HashMap();
        map.put("systemID", systemID);
        map.put("systemUserID", systemUserID);
        List<SystemMenu> menuList = systemMenuMapper.getSystemMenuBySystemIDAndSystemUserID(map);
        return menuList;
    }

    /**
     * 根据登陆用户存入的session信息，获取用户的信息查询菜单
     * */
    @Override
    public Map<String, Object> getUserSystemMenu(HttpServletRequest request) throws Exception {
        Map map = new HashMap();
        SystemUser user = (SystemUser) request.getSession().getAttribute(SessionKey.SESSION_ADMIN);
        // 获取该用户下所有的菜单
        List<SystemMenu> systemMenus = getSystemMenuBySystemIDAndSystemUserID(user.getSystemId(), user.getSystemUserId());
        // 要返回给前台的左侧菜单
        List<SystemMenu> leftMenu = new ArrayList<SystemMenu>();
        for (SystemMenu sm : systemMenus){
            if (sm.getParentMenuId() == 0){
                sm.setParent(true);
            } else {
                sm.setParent(false);
            }

            if (sm.isParent()){
                List<SystemMenu> childMenu = getSystemMenuBySystemIDAndParentSystemMenuID(user.getSystemUserId(), sm.getSystemMenuId());
                sm.setChildMenus(childMenu);
                leftMenu.add(sm);
            }
        }
        map.put("leftMenu",leftMenu);
        // 将菜单存入session
        request.getSession().setAttribute(SessionKey.SESSION_SYSTEM_MENU,leftMenu);
        return map;
    }

    /**
     * 根据登陆用户ID和系统菜单ID查询此菜单下的子菜单
     * */
    @Override
    public List<SystemMenu> getSystemMenuBySystemIDAndParentSystemMenuID(Integer systemUserID, Integer systemMenuID) throws Exception {
        Map<String,Integer> map = new HashMap();
        map.put("systemUserID", systemUserID);
        map.put("systemMenuID", systemMenuID);
        List<SystemMenu> childMenus = systemMenuMapper.getSystemMenuBySystemIDAndParentSystemMenuID(map);
        return childMenus;
    }
}
