package com.example.springkaoqin.mapper;

import com.example.springkaoqin.bean.DepartmentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DepartmentInfoMapper {
    @Select("SELECT * FROM department WHERE dno = #{dno}")
    DepartmentInfo getDepartmentInfo(@Param("dno") int dno);
}
