package com.example.springkaoqin.service;

import com.example.springkaoqin.bean.BusinessRecord;

import java.util.List;

public interface BusinessRecordService {
    List<BusinessRecord> getBusinessRecords(String startTime, String endTime);
}
