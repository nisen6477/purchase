package cn.hpu.purchase.service.impl.system;

import cn.hpu.purchase.mapper.system.SystemUserMapper;
import cn.hpu.purchase.po.system.SystemUser;
import cn.hpu.purchase.service.system.SystemUserService;
import cn.hpu.purchase.util.MD5;
import cn.hpu.purchase.util.SessionKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: 倪森森
 * @description:
 * @date: Created in 11:56 2018/3/9
 */
@Service
public class SystemUserServiceImpl implements SystemUserService {
    @Autowired
    private SystemUserMapper systemUserMapper;

    @Override
    public int insert(SystemUser record) throws Exception {
        return 0;
    }

    @Override
    public SystemUser selectByPrimaryKey(Integer systemUserId) throws Exception {
        SystemUser systemUser = systemUserMapper.selectByPrimaryKey(systemUserId);
        return systemUser;
    }

    @Override
    public int updateByPrimaryKey(SystemUser record) throws Exception {
        return 0;
    }

    @Override
    public SystemUser getSystemUser(String username, String password, HttpServletRequest request) throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("username", username);
        map.put("password", MD5.md5(password));
        SystemUser user = systemUserMapper.getSystemUserByUserNameAndPassword(map);
        if (user != null){
            request.getSession().setAttribute(SessionKey.SESSION_ADMIN, user);
        }
        return user;
    }
}
