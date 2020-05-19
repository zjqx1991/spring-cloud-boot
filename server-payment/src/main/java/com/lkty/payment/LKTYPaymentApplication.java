package com.lkty.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lkty.payment.mapper")
public class LKTYPaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(LKTYPaymentApplication.class, args);
    }
}
