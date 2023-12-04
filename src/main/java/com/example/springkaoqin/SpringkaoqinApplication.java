//SpringkaoqinApplication.java application类
package com.example.springkaoqin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.example.springkaoqin.mapper")
public class SpringkaoqinApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringkaoqinApplication.class, args);
    }
}
