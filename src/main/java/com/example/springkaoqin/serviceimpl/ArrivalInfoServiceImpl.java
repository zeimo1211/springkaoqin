package com.example.springkaoqin.serviceimpl;

import com.example.springkaoqin.bean.ArrivalInfo;
import com.example.springkaoqin.mapper.ArrivalInfoMapper;
import com.example.springkaoqin.service.ArrivalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArrivalInfoServiceImpl implements ArrivalInfoService {
    private final ArrivalInfoMapper arrivalInfoMapper;

    @Autowired
    public ArrivalInfoServiceImpl(ArrivalInfoMapper arrivalInfoMapper) {
        this.arrivalInfoMapper = arrivalInfoMapper;
    }

    @Override
    public List<ArrivalInfo> calculateArrivals(String startTime, String endTime) {
        return arrivalInfoMapper.calculateArrivals(startTime, endTime);
    }
}
