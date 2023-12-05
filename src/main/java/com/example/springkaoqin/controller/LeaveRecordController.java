package com.example.springkaoqin.controller;

import com.example.springkaoqin.bean.LeaveRecord;
import com.example.springkaoqin.service.LeaveRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get-leave-records")
public class LeaveRecordController {
    private final LeaveRecordService leaveRecordService;

    @Autowired
    public LeaveRecordController(LeaveRecordService leaveRecordService) {
        this.leaveRecordService = leaveRecordService;
    }

    @PostMapping
    public List<LeaveRecord> getLeaveRecords(String startTime, String endTime) {
        return leaveRecordService.getLeaveRecords(startTime, endTime);
    }
}
