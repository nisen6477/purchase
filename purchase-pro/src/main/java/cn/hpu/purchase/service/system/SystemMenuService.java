package cn.hpu.purchase.service.system;

import cn.hpu.purchase.po.system.SystemMenu;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface SystemMenuService {

    int insert(SystemMenu record) throws Exception;

    SystemMenu selectByPrimaryKey(Integer systemMenuId) throws Exception;

    int updateByPrimaryKey(SystemMenu record) throws Exception;

    /**
     * 获取用户的所有菜单
     * */
    List<SystemMenu> getSystemMenuBySystemIDAndSystemUserID(Integer systemID, Integer systemUserID) throws Exception;

    /**
     * 根据登陆用户存入的session信息，获取用户的信息查询菜单
     * */
    Map<String, Object> getUserSystemMenu(HttpServletRequest request) throws Exception;

    /**
     * 查询该用户下菜单的子菜单
     * */
    List<SystemMenu> getSystemMenuBySystemIDAndParentSystemMenuID(Integer systemUserID, Integer systemMenuID) throws Exception;
}