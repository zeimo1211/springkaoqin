package com.example.springkaoqin.mapper;

import com.example.springkaoqin.bean.AwayInfo;
import org.apache.ibatis.annotations.Insert;

public interface AwayMapper {
    @Insert("INSERT INTO out_business_info (wno, bistate, bitime, bireason) VALUES (#{wno}, #{bistate}, #{bitime}, #{bireason})")
    int insertAwayInfo(AwayInfo awayInfo);
}
