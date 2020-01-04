package com.edu.baiedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.edu.baiedu.repository")
public class BaieduApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaieduApplication.class, args);
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles",true);
    }

}
