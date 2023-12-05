package com.example.springkaoqin.serviceimpl;

import com.example.springkaoqin.bean.LeaveInfo;
import com.example.springkaoqin.mapper.LeaveInfoMapper;
import com.example.springkaoqin.service.LeaveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveInfoServiceImpl implements LeaveInfoService {
    private final LeaveInfoMapper leaveInfoMapper;

    @Autowired
    public LeaveInfoServiceImpl(LeaveInfoMapper leaveInfoMapper) {
        this.leaveInfoMapper = leaveInfoMapper;
    }

    @Override
    public boolean insertLeaveInfo(LeaveInfo leaveInfo) {
        return leaveInfoMapper.insertLeaveInfo(leaveInfo) > 0;
    }
}
