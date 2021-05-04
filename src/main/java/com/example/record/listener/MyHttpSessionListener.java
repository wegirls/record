package com.example.record.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author rui.zhou
 * @date 2021/05/03 20:25
 */
@Slf4j
@WebListener
public class MyHttpSessionListener implements HttpSessionListener {

    /**
     * 监控在线人数
     */
    public static int online = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("创建session");
        online++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("销毁session");
    }
}
