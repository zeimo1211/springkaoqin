package com.example.springkaoqin.service;

import com.example.springkaoqin.bean.LeaveRecord;

import java.util.List;

public interface LeaveRecordService {
    List<LeaveRecord> getLeaveRecords(String startTime, String endTime);
}
