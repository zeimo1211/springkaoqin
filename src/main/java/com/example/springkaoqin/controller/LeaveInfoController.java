package com.example.springkaoqin.controller;

import com.example.springkaoqin.bean.LeaveInfo;
import com.example.springkaoqin.service.LeaveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leave")
public class LeaveInfoController {
    private final LeaveInfoService leaveInfoService;

    @Autowired
    public LeaveInfoController(LeaveInfoService leaveInfoService) {
        this.leaveInfoService = leaveInfoService;
    }

    @PostMapping
    public String leaveInfo(LeaveInfo leaveInfo) {
        if (leaveInfoService.insertLeaveInfo(leaveInfo)) {
            return "{\"success\": true}";
        } else {
            return "{\"success\": false}";
        }
    }
}
