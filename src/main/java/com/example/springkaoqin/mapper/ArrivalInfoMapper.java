package com.example.springkaoqin.mapper;

import com.example.springkaoqin.bean.ArrivalInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArrivalInfoMapper {
    List<ArrivalInfo> calculateArrivals(String startTime, String endTime);
}
