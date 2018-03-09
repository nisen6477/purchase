package test/mapper;

import java.util.List;
import test/po.SystemUser;

public interface SystemUserMapper {
    int deleteByPrimaryKey(Integer systemUserId);

    int insert(SystemUser record);

    SystemUser selectByPrimaryKey(Integer systemUserId);

    List<SystemUser> selectAll();

    int updateByPrimaryKey(SystemUser record);
}