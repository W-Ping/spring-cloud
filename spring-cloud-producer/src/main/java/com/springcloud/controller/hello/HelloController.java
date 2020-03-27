package com.springcloud.controller.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author liu_wp
 * @date 2020/3/26 16:36
 * @see
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return name + " 你好 !,第二个 现在是：" + LocalDateTime.now().toString();
    }
}
