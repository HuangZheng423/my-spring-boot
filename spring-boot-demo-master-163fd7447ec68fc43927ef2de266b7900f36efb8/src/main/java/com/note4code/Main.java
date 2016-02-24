package com.note4code;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by wuzhiyu on 16-1-10.
 */

@SpringBootApplication
@MapperScan("com.note4code.mapper")
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
}
