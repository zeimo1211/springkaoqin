package com.example.springkaoqin.controller;

import com.example.springkaoqin.service.WorkInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign")
public class WorkInfoController {
    private final WorkInfoService workInfoService;

    @Autowired
    public WorkInfoController(WorkInfoService workInfoService) {
        this.workInfoService = workInfoService;
    }

    @PostMapping
    public String userSign(@RequestParam String username, @RequestParam String type) {
        try {
            workInfoService.userSign(username, type);
            return "{\"success\": true}";
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"success\": false}";
        }
    }
}
