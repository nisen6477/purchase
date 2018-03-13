package cn.hpu.purchase.mapper.inquiry;

import java.util.List;
import cn.hpu.purchase.po.inquiry.InquiryHeader;

public interface InquiryHeaderMapper {
    int deleteByPrimaryKey(Integer inquiryId) throws Exception;

    int insert(InquiryHeader record) throws Exception;

    InquiryHeader selectByPrimaryKey(Integer inquiryId) throws Exception;

    List<InquiryHeader> selectAll() throws Exception;

    int updateByPrimaryKey(InquiryHeader record) throws Exception;
}