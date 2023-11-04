package com.example.springkaoqin;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("ccom.example.springkaoqin.mapper")
public class main {
    public static void main(String[] args){
        SpringApplication.run(SpringkaoqinApplication.class,args);
    }
}

