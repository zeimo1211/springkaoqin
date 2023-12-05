package com.example.springkaoqin.service;

import com.example.springkaoqin.bean.OvertimeInfo;

import java.util.List;

public interface OvertimeInfoService {
    List<OvertimeInfo> calculateOvertime(String startTime, String endTime);
}
