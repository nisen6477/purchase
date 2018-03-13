package test/mapper;

import java.util.List;
import test/po.InquiryHeader;

public interface InquiryHeaderMapper {
    int deleteByPrimaryKey(Integer inquiryId);

    int insert(InquiryHeader record);

    InquiryHeader selectByPrimaryKey(Integer inquiryId);

    List<InquiryHeader> selectAll();

    int updateByPrimaryKey(InquiryHeader record);
}