package test/mapper;

import java.util.List;
import test/po.InquiryDetail;

public interface InquiryDetailMapper {
    int deleteByPrimaryKey(Integer inquiryDetailId);

    int insert(InquiryDetail record);

    InquiryDetail selectByPrimaryKey(Integer inquiryDetailId);

    List<InquiryDetail> selectAll();

    int updateByPrimaryKey(InquiryDetail record);
}