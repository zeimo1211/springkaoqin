//WorkerMapper.java mapper类
package com.example.springkaoqin.mapper;
import com.example.springkaoqin.bean.Worker;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface WorkerMapper {
    Worker findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
