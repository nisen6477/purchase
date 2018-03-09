package cn.hpu.purchase.service.system;

import cn.hpu.purchase.po.system.SystemUser;

import javax.servlet.http.HttpServletRequest;

public interface SystemUserService {

    int insert(SystemUser record) throws Exception;

    SystemUser selectByPrimaryKey(Integer systemUserId) throws Exception;

    int updateByPrimaryKey(SystemUser record) throws Exception;

    SystemUser getSystemUser(String username, String password, HttpServletRequest request) throws Exception;

}