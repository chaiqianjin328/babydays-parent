package com.babydays;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.babydays.dao"})
@EnableDubbo
@MapperScan(value = "com/babydays/dao")
@EnableTransactionManagement
public class BabydaysServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BabydaysServiceApplication.class, args);
    }

}
