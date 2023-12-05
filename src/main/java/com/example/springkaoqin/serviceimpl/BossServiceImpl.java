package com.example.springkaoqin.serviceimpl;

import com.example.springkaoqin.bean.BossInfo;
import com.example.springkaoqin.mapper.BossMapper;
import com.example.springkaoqin.service.BossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BossServiceImpl implements BossService {
    private final BossMapper bossMapper;

    @Autowired
    public BossServiceImpl(BossMapper bossMapper) {
        this.bossMapper = bossMapper;
    }

    @Override
    public boolean checkUserLogin(String username, String password) {
        BossInfo bossInfo = bossMapper.checkUserLogin(username, password, true);
        return bossInfo != null;
    }
}
