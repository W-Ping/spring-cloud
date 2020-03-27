package com.springcloud.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liu_wp
 * @date 2020/3/27 9:49
 * @see
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    /**
     * hello
     *
     * @param name
     * @return
     */
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello!" + name + ", this messge send failed ";
    }
}
