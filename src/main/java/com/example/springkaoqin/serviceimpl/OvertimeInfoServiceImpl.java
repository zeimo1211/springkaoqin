package com.example.springkaoqin.serviceimpl;

import com.example.springkaoqin.bean.OvertimeInfo;
import com.example.springkaoqin.mapper.OvertimeInfoMapper;
import com.example.springkaoqin.service.OvertimeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OvertimeInfoServiceImpl implements OvertimeInfoService {
    private final OvertimeInfoMapper overtimeInfoMapper;

    @Autowired
    public OvertimeInfoServiceImpl(OvertimeInfoMapper overtimeInfoMapper) {
        this.overtimeInfoMapper = overtimeInfoMapper;
    }

    @Override
    public List<OvertimeInfo> calculateOvertime(String startTime, String endTime) {
        return overtimeInfoMapper.calculateOvertime(startTime, endTime);
    }
}
