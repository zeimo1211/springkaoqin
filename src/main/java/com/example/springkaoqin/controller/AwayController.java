package com.example.springkaoqin.controller;

import com.example.springkaoqin.bean.AwayInfo;
import com.example.springkaoqin.service.AwayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/away")
public class AwayController {
    private final AwayService awayService;

    @Autowired
    public AwayController(AwayService awayService) {
        this.awayService = awayService;
    }

    @PostMapping
    public String userAway(@RequestBody AwayInfo awayInfo) {
        if (awayService.userAway(awayInfo)) {
            return "{\"success\": true}";
        } else {
            return "{\"success\": false}";
        }
    }
}
