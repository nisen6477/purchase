package cn.hpu.purchase.mapper.storage;

import java.util.List;
import cn.hpu.purchase.po.storage.StorageDetail;

public interface StorageDetailMapper {
    int deleteByPrimaryKey(Integer storageDetailId) throws Exception;

    int insert(StorageDetail record) throws Exception;

    StorageDetail selectByPrimaryKey(Integer storageDetailId) throws Exception;

    List<StorageDetail> selectAll() throws Exception;

    int updateByPrimaryKey(StorageDetail record) throws Exception;
}