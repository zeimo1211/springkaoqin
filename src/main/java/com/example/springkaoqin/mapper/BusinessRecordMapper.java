package com.example.springkaoqin.mapper;

import com.example.springkaoqin.bean.BusinessRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BusinessRecordMapper {
    List<BusinessRecord> getBusinessRecords(String startTime, String endTime);
}
