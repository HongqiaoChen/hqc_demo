package cn.uestc;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@NacosPropertySource(dataId = "config", autoRefreshed = true)
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

    @NacosValue(value = "${nacos.test.config:test123}",autoRefreshed = true)
    private String config;

    @GetMapping("/test4")
    public String test(){
        return config;
    }


}
