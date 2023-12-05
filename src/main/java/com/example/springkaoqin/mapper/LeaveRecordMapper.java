package com.example.springkaoqin.mapper;

import com.example.springkaoqin.bean.LeaveRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LeaveRecordMapper {
    List<LeaveRecord> getLeaveRecords(String startTime, String endTime);
}
