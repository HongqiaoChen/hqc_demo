package cn.uestc.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping(value = "/test1" ,method = RequestMethod.GET)
    public String test1(){
        return "hello";
    }



}
