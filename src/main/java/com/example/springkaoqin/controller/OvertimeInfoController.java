package com.example.springkaoqin.controller;

import com.example.springkaoqin.bean.OvertimeInfo;
import com.example.springkaoqin.service.OvertimeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calculate-overtime")
public class OvertimeInfoController {
    private final OvertimeInfoService overtimeInfoService;

    @Autowired
    public OvertimeInfoController(OvertimeInfoService overtimeInfoService) {
        this.overtimeInfoService = overtimeInfoService;
    }

    @PostMapping
    public List<OvertimeInfo> calculateOvertime(String startTime, String endTime) {
        return overtimeInfoService.calculateOvertime(startTime, endTime);
    }
}
