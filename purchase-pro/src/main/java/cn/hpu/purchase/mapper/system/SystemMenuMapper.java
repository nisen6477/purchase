package cn.hpu.purchase.mapper.system;

import cn.hpu.purchase.po.system.SystemMenu ;

import java.util.List;
import java.util.Map;

public interface SystemMenuMapper {

    int insert(SystemMenu record) throws Exception;

    SystemMenu selectByPrimaryKey(Integer systemMenuId) throws Exception;

    int updateByPrimaryKey(SystemMenu record) throws Exception;

    List<SystemMenu> getSystemMenuBySystemIDAndSystemUserID(Map map) throws Exception;

    List<SystemMenu> getSystemMenuBySystemIDAndParentSystemMenuID(Map map) throws Exception;
}