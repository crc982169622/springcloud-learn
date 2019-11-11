package com.crc.eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.crc.eurekaconsumer"})
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class EurekaConsumerApplication {

    @Autowired
    private FeignService feignService;

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class, args);
    }

    @RequestMapping("/test")
    public String test() {
        return feignService.test();
    }

    @GetMapping("/test1")
    public String test1() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }


}
