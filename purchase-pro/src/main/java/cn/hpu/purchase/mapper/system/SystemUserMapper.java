package cn.hpu.purchase.mapper.system;

import cn.hpu.purchase.po.system.SystemUser ;

import java.util.Map;
/**
 * @Description: 使用mapper代理开发，mapper层相当于dao层
 * @author: 倪森森
 * */
public interface SystemUserMapper {

    int insert(SystemUser record) throws Exception;

    SystemUser selectByPrimaryKey(Integer systemUserId) throws Exception;

    int updateByPrimaryKey(SystemUser record) throws Exception;

    SystemUser getSystemUserByUserNameAndPassword(Map<String,String> map) throws Exception;
}