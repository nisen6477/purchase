package cn.hpu.purchase.service.system;

import cn.hpu.purchase.po.system.Status;

import java.util.List;

public interface StatusService {
    int deleteByPrimaryKey(Integer statusId) throws Exception;

    int insert(Status record) throws Exception;

    Status selectByPrimaryKey(Integer statusId) throws Exception;

    List<Status> selectAll() throws Exception;

    int updateByPrimaryKey(Status record) throws Exception;

    /**
     * 获取采购单状态下拉框
     * */
    List<Status> getPurchaseStatusForSpinner() throws Exception;
}