package com.example.springkaoqin.mapper;

import com.example.springkaoqin.bean.BossInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BossMapper {
    @Select("SELECT * FROM worker WHERE wno = #{wno} AND keyword = #{keyword} AND issuper = #{issuper}")
    BossInfo checkUserLogin(@Param("wno") String wno, @Param("keyword") String keyword, @Param("issuper") boolean issuper);
}
