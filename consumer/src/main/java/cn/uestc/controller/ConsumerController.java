package cn.uestc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController

public class ConsumerController {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2() {
        return restTemplate.getForObject("http://localhost:8081/test1", String.class);
    }


}
