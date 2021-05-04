package com.example.record.pattern.proxy.dynamic;

import lombok.extern.slf4j.Slf4j;

/**
 * @author rui.zhou
 * @date 2021/05/03 16:31
 */
@Slf4j
public class RealSubject implements Subject{
    @Override
    public int sellBooks() {
        log.info("卖书");
        return 0;
    }

    @Override
    public String speak() {
        log.info("说话");
        return "张三";
    }
}
