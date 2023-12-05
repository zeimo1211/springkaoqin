package com.example.springkaoqin.serviceimpl;

import com.example.springkaoqin.bean.LeaveRecord;
import com.example.springkaoqin.mapper.LeaveRecordMapper;
import com.example.springkaoqin.service.LeaveRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveRecordServiceImpl implements LeaveRecordService {
    private final LeaveRecordMapper leaveRecordMapper;

    @Autowired
    public LeaveRecordServiceImpl(LeaveRecordMapper leaveRecordMapper) {
        this.leaveRecordMapper = leaveRecordMapper;
    }

    @Override
    public List<LeaveRecord> getLeaveRecords(String startTime, String endTime) {
        return leaveRecordMapper.getLeaveRecords(startTime, endTime);
    }
}
