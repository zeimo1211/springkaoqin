// WorkerController.java
package com.example.springkaoqin.controller;

import com.example.springkaoqin.bean.Worker;
import com.example.springkaoqin.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workerinfo")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @PostMapping
    public Worker getWorkerInfo(@RequestBody String username) {
        return workerService.getWorkerInfo(username);
    }
}
