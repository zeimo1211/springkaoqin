package com.example.springkaoqin.servicelmpl;
import com.example.springkaoqin.bean.UserBean;
import com.example.springkaoqin.service.UserService;
import org.springframework.stereotype.Service;
import com.example.springkaoqin.mapper.Usermapper;
import javax.annotation.Resource;
@Service
public class UserServicelmpl implements UserService {
    @Resource
    private Usermapper userMapper;
    public UserBean logIn(String name, String password)
    {
        return userMapper.getInfo(name,password);
    }
}
