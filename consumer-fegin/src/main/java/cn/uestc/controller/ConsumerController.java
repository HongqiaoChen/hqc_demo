package cn.uestc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import cn.uestc.client.ProviderClient;

import javax.annotation.Resource;

@RestController

public class ConsumerController {
    @Resource
    private ProviderClient providerClient;

    @RequestMapping(value = "/test3",method = RequestMethod.GET)
    public String test3(){
        return providerClient.test1();
    }


}
