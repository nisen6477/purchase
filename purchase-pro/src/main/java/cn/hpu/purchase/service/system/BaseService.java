package cn.hpu.purchase.service.system;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;

/**
 * @author: 倪森森
 * @description:
 * @date: Created in 11:42 2018/3/9
 */
public abstract class BaseService <D extends Mapper<T>, T extends Serializable> {
    @Autowired
    protected D dao;

    /**
     * 通过id查询 实体
     * @param id id
     * @return 实体
     */
    public T selectByPrimaryKey(Integer id) {
        return this.dao.selectByPrimaryKey(id);
    }

    /**
     * 通过id删除实体
     * @param id id
     * @return 提示信息
     */
    public Integer deleteById(Integer id) {

        return this.dao.deleteByPrimaryKey(id);
    }

    public D getDao() {
        return dao;
    }

    public void setDao(D dao) {
        this.dao = dao;
    }

}
