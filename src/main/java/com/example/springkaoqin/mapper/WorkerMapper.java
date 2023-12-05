//WorkerMapper.java mapper类
package com.example.springkaoqin.mapper;
import com.example.springkaoqin.bean.Worker;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface WorkerMapper {
    @Select("SELECT * FROM worker WHERE wno = #{username} AND keyword = #{password}")
    Worker findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
