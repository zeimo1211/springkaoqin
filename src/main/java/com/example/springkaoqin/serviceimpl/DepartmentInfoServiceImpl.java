package com.example.springkaoqin.serviceimpl;

import com.example.springkaoqin.bean.DepartmentInfo;
import com.example.springkaoqin.mapper.DepartmentInfoMapper;
import com.example.springkaoqin.service.DepartmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentInfoServiceImpl implements DepartmentInfoService {
    private final DepartmentInfoMapper departmentInfoMapper;

    @Autowired
    public DepartmentInfoServiceImpl(DepartmentInfoMapper departmentInfoMapper) {
        this.departmentInfoMapper = departmentInfoMapper;
    }

    @Override
    public DepartmentInfo getDepartmentInfo(int dno) {
        return departmentInfoMapper.getDepartmentInfo(dno);
    }
}
