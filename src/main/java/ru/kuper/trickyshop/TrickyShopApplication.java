package ru.kuper.trickyshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TrickyShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrickyShopApplication.class, args);
    }

}
