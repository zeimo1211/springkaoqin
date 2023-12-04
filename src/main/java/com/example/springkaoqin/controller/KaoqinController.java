//KaoqinController.java controller类
package com.example.springkaoqin.controller;
import com.example.springkaoqin.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/kaoqin")
public class KaoqinController {

    @Autowired
    private WorkerService workerService;

    @PostMapping("/login")
    public @ResponseBody Map<String, Object> login(@RequestParam String username, @RequestParam String password) {
        boolean success = workerService.checkUserLogin(username, password);
        return Map.of("success", success);
    }
}
