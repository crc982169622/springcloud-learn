package com.crc.springcloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chenrencun
 * @Date: 2019/10/11 11:24
 * @Description: 描述
 */
@RestController
public class FallbackController {

    @GetMapping("/fallbackController")
    public String result() {
        return "this is error!";
    }
}
