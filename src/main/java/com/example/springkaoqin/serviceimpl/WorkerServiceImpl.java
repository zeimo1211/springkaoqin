//WorkerServiceImpl.java service实现类
package com.example.springkaoqin.serviceimpl;

import com.example.springkaoqin.bean.Worker;
import com.example.springkaoqin.mapper.WorkerMapper;
import com.example.springkaoqin.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerMapper workerMapper;

    @Override
    public boolean checkUserLogin(String username, String password) {
        try {
            // 调用MyBatis的Mapper方法进行数据库查询
            Worker worker = workerMapper.findByUsernameAndPassword(username, password);
            return worker != null;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return false;
        }
    }
}
