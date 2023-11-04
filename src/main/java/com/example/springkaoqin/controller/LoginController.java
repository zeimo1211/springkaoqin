package com.example.springkaoqin.controller;
import com.example .springkaoqin.bean.UserBean;
import com.example.springkaoqin.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Resource;
@Controller
public class LoginController {
    @Resource
    UserService userService;
    @RequestMapping("/loginView")
    public String show(){return "loginView";}

    @RequestMapping(value = "/logIn",method = RequestMethod.POST)
    public String LoginMethod(String name,String password)
    {
        UserBean userBean = userService.logIn(name,password);
        if(userBean!=null)
            return  "success";
        else
            return  "error";
    }

}
