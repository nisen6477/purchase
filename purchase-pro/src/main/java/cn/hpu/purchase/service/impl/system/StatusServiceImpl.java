package cn.hpu.purchase.service.impl.system;

import cn.hpu.purchase.mapper.system.StatusMapper;
import cn.hpu.purchase.po.system.Status;
import cn.hpu.purchase.service.system.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 倪森森
 * @description:
 * @date: Created in 15:09 2018/3/13
 */
@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusMapper statusMapper;

    @Override
    public int deleteByPrimaryKey(Integer statusId) throws Exception {
        return 0;
    }

    @Override
    public int insert(Status record) throws Exception {
        return 0;
    }

    @Override
    public Status selectByPrimaryKey(Integer statusId) throws Exception {
        return null;
    }

    @Override
    public List<Status> selectAll() throws Exception {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Status record) throws Exception {
        return 0;
    }

    @Override
    public List<Status> getPurchaseStatusForSpinner() {
        return statusMapper.getPurchaseStatusForSpinner("PurchaseStatus");
    }
}
