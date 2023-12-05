package com.example.springkaoqin.mapper;

import com.example.springkaoqin.bean.OvertimeInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OvertimeInfoMapper {
    List<OvertimeInfo> calculateOvertime(String startTime, String endTime);
}
