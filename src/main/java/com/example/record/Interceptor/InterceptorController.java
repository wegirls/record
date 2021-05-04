package com.example.record.Interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rui.zhou
 * @date 2021/05/03 21:29
 */
@Slf4j
@RestController
@RequestMapping("/interceptor")
public class InterceptorController {

    @RequestMapping("test")
    public String test() {
        log.info("test | {}");
        return "this is a interceptor test!";
    }

    @RequestMapping("index")
    public String index() {
        log.info("index | {}");
        return "this is a interceptor index!";
    }
}
