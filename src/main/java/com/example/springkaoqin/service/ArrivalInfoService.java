package com.example.springkaoqin.service;

import com.example.springkaoqin.bean.ArrivalInfo;

import java.util.List;

public interface ArrivalInfoService {
    List<ArrivalInfo> calculateArrivals(String startTime, String endTime);
}
