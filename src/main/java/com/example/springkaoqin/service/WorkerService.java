//WorkerService service接口
package com.example.springkaoqin.service;


import com.example.springkaoqin.bean.Worker;

public interface WorkerService {
    boolean checkUserLogin(String username, String password);
    Worker getWorkerInfo(String username);
}
