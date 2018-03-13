package cn.hpu.purchase.mapper.storage;

import java.util.List;
import cn.hpu.purchase.po.storage.StorageHeader;

public interface StorageHeaderMapper {
    int deleteByPrimaryKey(Integer storageId) throws Exception;

    int insert(StorageHeader record) throws Exception;

    StorageHeader selectByPrimaryKey(Integer storageId) throws Exception;

    List<StorageHeader> selectAll() throws Exception;

    int updateByPrimaryKey(StorageHeader record) throws Exception;

    Integer getStorageHeaderQuantity() throws Exception;
}