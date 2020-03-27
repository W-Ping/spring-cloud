package com.springcloud.controller.hello;

import com.springcloud.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liu_wp
 * @date 2020/3/26 16:52
 * @see
 */
@RestController
@RefreshScope // POST http://127.0.0.1:8001/actuator/refresh
public class ConsumerController {
    @Autowired
    private HelloRemote helloRemote;
    @Value("${sc-config.value}")
    private String serverPort;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        String hello = helloRemote.hello(name);
        String str = hello + " config serverPort:" + (serverPort != null ? serverPort : "");
        return str;
    }
}
