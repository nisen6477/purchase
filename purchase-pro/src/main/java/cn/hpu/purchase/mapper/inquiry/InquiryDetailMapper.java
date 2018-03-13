package cn.hpu.purchase.mapper.inquiry;

import java.util.List;
import cn.hpu.purchase.po.inquiry.InquiryDetail;

public interface InquiryDetailMapper {
    int deleteByPrimaryKey(Integer inquiryDetailId) throws Exception;

    int insert(InquiryDetail record) throws Exception;

    InquiryDetail selectByPrimaryKey(Integer inquiryDetailId) throws Exception;

    List<InquiryDetail> selectAll() throws Exception;

    int updateByPrimaryKey(InquiryDetail record) throws Exception;
}