package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author sunli
 * @Date 2020/1/15
 */
@EnableScheduling
@EnableTransactionManagement
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class AppStarts {
    public static void main(String[] args) {
        SpringApplication.run(AppStarts.class, args);
    }
}
