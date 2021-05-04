package com.example.record.pattern.proxy.cglib;

import lombok.extern.slf4j.Slf4j;

/**
 * @author rui.zhou
 * @date 2021/05/03 16:45
 */
@Slf4j
public class Engineer {

    /**
     * 可以被代理
     */
    public void eat() {
        log.info("工程师正在吃饭");
    }

    /**
     * final 方法不会被生成的字类覆盖
     */
    public final void work() {
        log.info("工程师正在工作");
    }

    /**
     * private 方法不会被生成的字类覆盖
     */
    private void play() {
        log.info("this engineer is playing game");
    }
}
