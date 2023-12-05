package com.example.springkaoqin.mapper;

import com.example.springkaoqin.bean.LeaveInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LeaveInfoMapper {
    @Insert("INSERT INTO ask_for_leave_info (wno, listate, litime, lireason) VALUES (#{wno}, #{listate}, #{litime}, #{lireason})")
    int insertLeaveInfo(LeaveInfo leaveInfo);
}
