package com.example.springkaoqin.serviceimpl;

import com.example.springkaoqin.bean.BusinessRecord;
import com.example.springkaoqin.mapper.BusinessRecordMapper;
import com.example.springkaoqin.service.BusinessRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessRecordServiceImpl implements BusinessRecordService {
    private final BusinessRecordMapper businessRecordMapper;

    @Autowired
    public BusinessRecordServiceImpl(BusinessRecordMapper businessRecordMapper) {
        this.businessRecordMapper = businessRecordMapper;
    }

    @Override
    public List<BusinessRecord> getBusinessRecords(String startTime, String endTime) {
        return businessRecordMapper.getBusinessRecords(startTime, endTime);
    }
}
