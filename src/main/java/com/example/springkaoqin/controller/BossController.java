package com.example.springkaoqin.controller;

import com.example.springkaoqin.service.BossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boss")
public class BossController {
    private final BossService bossService;

    @Autowired
    public BossController(BossService bossService) {
        this.bossService = bossService;
    }

    @PostMapping
    public String checkUserLogin(@RequestParam String username, @RequestParam String password) {
        if (bossService.checkUserLogin(username, password)) {
            return "{\"success\": true}";
        } else {
            return "{\"success\": false}";
        }
    }
}
