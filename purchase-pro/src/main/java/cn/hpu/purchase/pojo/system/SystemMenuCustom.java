package cn.hpu.purchase.pojo.system;

import cn.hpu.purchase.po.system.SystemMenu;

import java.util.List;

/**
 * @author: 倪森森
 * @description: SystemMenu包装类，用于查询每个菜单下面的子菜单
 * @date: Created in 16:50 2018/3/9
 */
public class SystemMenuCustom extends SystemMenu {

    private boolean isParent;

    private List<SystemMenu> childMenus;

    @Override
    public boolean isParent() {
        return isParent;
    }

    @Override
    public void setParent(boolean parent) {
        isParent = parent;
    }

    @Override
    public List<SystemMenu> getChildMenus() {
        return childMenus;
    }

    @Override
    public void setChildMenus(List<SystemMenu> childMenus) {
        this.childMenus = childMenus;
    }
}
