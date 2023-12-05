package com.example.springkaoqin.serviceimpl;

import com.example.springkaoqin.bean.WorkInfo;
import com.example.springkaoqin.mapper.WorkInfoMapper;
import com.example.springkaoqin.service.WorkInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class WorkInfoServiceImpl implements WorkInfoService {
    private final WorkInfoMapper workInfoMapper;

    @Autowired
    public WorkInfoServiceImpl(WorkInfoMapper workInfoMapper) {
        this.workInfoMapper = workInfoMapper;
    }

    @Override
    public void userSign(String username, String type) {
        WorkInfo workInfo = new WorkInfo();
        workInfo.setWno(username);
        workInfo.setWistate(type);
        workInfo.setWitime(new Timestamp(System.currentTimeMillis()));

        workInfoMapper.insertWorkInfo(workInfo);
    }
}
