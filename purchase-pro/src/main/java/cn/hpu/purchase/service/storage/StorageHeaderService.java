package cn.hpu.purchase.service.storage;

import cn.hpu.purchase.po.storage.StorageHeader;

import java.util.List;

public interface StorageHeaderService {
    int deleteByPrimaryKey(Integer storageId) throws Exception;

    int insert(StorageHeader record) throws Exception;

    StorageHeader selectByPrimaryKey(Integer storageId) throws Exception;

    List<StorageHeader> selectAll() throws Exception;

    int updateByPrimaryKey(StorageHeader record) throws Exception;

    Integer getStorageHeaderQuantity() throws Exception;
}