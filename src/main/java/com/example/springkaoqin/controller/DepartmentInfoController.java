package com.example.springkaoqin.controller;

import com.example.springkaoqin.bean.DepartmentInfo;
import com.example.springkaoqin.service.DepartmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departmentinfo")
public class DepartmentInfoController {
    private final DepartmentInfoService departmentInfoService;

    @Autowired
    public DepartmentInfoController(DepartmentInfoService departmentInfoService) {
        this.departmentInfoService = departmentInfoService;
    }

    @PostMapping
    public DepartmentInfo getDepartmentInfo(@RequestParam("dno") int dno) {
        return departmentInfoService.getDepartmentInfo(dno);
    }
}
