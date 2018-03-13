package cn.hpu.purchase.service.impl.storage;

import cn.hpu.purchase.mapper.storage.StorageHeaderMapper;
import cn.hpu.purchase.po.storage.StorageHeader;
import cn.hpu.purchase.service.storage.StorageHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 倪森森
 * @description:
 * @date: Created in 12:01 2018/3/13
 */
@Service
public class StorageHeaderServiceImpl implements StorageHeaderService {

    @Autowired
    private StorageHeaderMapper storageHeaderMapper;

    @Override
    public int deleteByPrimaryKey(Integer storageId) throws Exception {
        return 0;
    }

    @Override
    public int insert(StorageHeader record) throws Exception {
        return 0;
    }

    @Override
    public StorageHeader selectByPrimaryKey(Integer storageId) throws Exception {
        return null;
    }

    @Override
    public List<StorageHeader> selectAll() throws Exception {
        return null;
    }

    @Override
    public int updateByPrimaryKey(StorageHeader record) throws Exception {
        return 0;
    }

    @Override
    public Integer getStorageHeaderQuantity() throws Exception {
        return storageHeaderMapper.getStorageHeaderQuantity();
    }
}
