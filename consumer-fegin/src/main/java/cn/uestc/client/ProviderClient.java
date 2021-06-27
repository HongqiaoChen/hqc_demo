package cn.uestc.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient("provider")
public interface ProviderClient  {

    @RequestMapping(value = "/test1" ,method = RequestMethod.GET)
    public String test1();
}
