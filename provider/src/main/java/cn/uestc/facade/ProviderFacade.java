package cn.uestc.facade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface ProviderFacade {
    @RequestMapping(value = "/test1" ,method = RequestMethod.GET)
    public String test1();

}
