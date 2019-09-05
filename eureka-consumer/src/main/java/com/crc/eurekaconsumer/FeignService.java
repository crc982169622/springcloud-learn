package com.crc.eurekaconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: chenrencun
 * @version：
 * @date: 2019/9/5 23:15
 **/
@FeignClient(value = "eureka-provider")
public interface FeignService {

    @RequestMapping("/test")
    public String test();

}
