package com.crc.eurekaconsumer;

import org.springframework.stereotype.Component;

/**
 * @author: chenrencun
 * @version：
 * @date: 2019/9/7 15:58
 **/
@Component
public class FeignFallBack implements FeignService {
    @Override
    public String test() {
        System.out.println("熔断，默认回调函数");
        return "调用远程服务错误！";
    }
}
