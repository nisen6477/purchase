package cn.hpu.purchase.mapper.system;

import java.util.List;
import cn.hpu.purchase.po.system.Status;

public interface StatusMapper {
    int deleteByPrimaryKey(Integer statusId) throws Exception;

    int insert(Status record) throws Exception;

    Status selectByPrimaryKey(Integer statusId) throws Exception;

    List<Status> selectAll() throws Exception;

    int updateByPrimaryKey(Status record) throws Exception;

    List<Status> getPurchaseStatusForSpinner(String statusType);
}