package com.example.record.listener.custom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * 继承了ApplicationContextEvent，就是个容器事件
 * @author rui.zhou
 * @date 2021/05/03 21:00
 */
public class MailSendEvent extends ApplicationContextEvent {

    private String to;


    public MailSendEvent(ApplicationContext source) {
        super(source);
    }

    public MailSendEvent(ApplicationContext source, String to) {
        super(source);
        this.to = to;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
