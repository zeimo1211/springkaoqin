package com.example.springkaoqin.controller;

import com.example.springkaoqin.bean.BusinessRecord;
import com.example.springkaoqin.service.BusinessRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get-business-records")
public class BusinessRecordController {
    private final BusinessRecordService businessRecordService;

    @Autowired
    public BusinessRecordController(BusinessRecordService businessRecordService) {
        this.businessRecordService = businessRecordService;
    }

    @PostMapping
    public List<BusinessRecord> getBusinessRecords(String startTime, String endTime) {
        return businessRecordService.getBusinessRecords(startTime, endTime);
    }
}
