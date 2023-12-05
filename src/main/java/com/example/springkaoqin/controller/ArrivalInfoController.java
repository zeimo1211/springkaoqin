package com.example.springkaoqin.controller;

import com.example.springkaoqin.bean.ArrivalInfo;
import com.example.springkaoqin.service.ArrivalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calculate-arrivals")
public class ArrivalInfoController {
    private final ArrivalInfoService arrivalInfoService;

    @Autowired
    public ArrivalInfoController(ArrivalInfoService arrivalInfoService) {
        this.arrivalInfoService = arrivalInfoService;
    }

    @PostMapping
    public List<ArrivalInfo> calculateArrivals(String startTime, String endTime) {
        return arrivalInfoService.calculateArrivals(startTime, endTime);
    }
}
