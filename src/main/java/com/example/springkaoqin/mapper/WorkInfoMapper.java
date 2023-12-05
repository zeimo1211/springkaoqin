package com.example.springkaoqin.mapper;

import com.example.springkaoqin.bean.WorkInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkInfoMapper {
    @Insert("INSERT INTO work_info (wno, wistate, witime) VALUES (#{wno}, #{wistate}, #{witime})")
    void insertWorkInfo(WorkInfo workInfo);
}
