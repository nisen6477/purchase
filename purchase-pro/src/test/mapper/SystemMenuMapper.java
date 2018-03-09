package test/mapper;

import java.util.List;
import test/po.SystemMenu;

public interface SystemMenuMapper {
    int deleteByPrimaryKey(Integer systemMenuId);

    int insert(SystemMenu record);

    SystemMenu selectByPrimaryKey(Integer systemMenuId);

    List<SystemMenu> selectAll();

    int updateByPrimaryKey(SystemMenu record);
}