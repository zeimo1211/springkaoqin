package com.example.springkaoqin.serviceimpl;

import com.example.springkaoqin.bean.AwayInfo;
import com.example.springkaoqin.mapper.AwayMapper;
import com.example.springkaoqin.service.AwayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AwayServiceImpl implements AwayService {
    private final AwayMapper awayMapper;

    @Autowired
    public AwayServiceImpl(AwayMapper awayMapper) {
        this.awayMapper = awayMapper;
    }

    @Override
    public boolean userAway(AwayInfo awayInfo) {
        int rowsInserted = awayMapper.insertAwayInfo(awayInfo);
        return rowsInserted == 1;
    }
}
