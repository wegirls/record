package com.example.record.listener.custom;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author rui.zhou
 * @date 2021/05/03 21:04
 */
@Slf4j
@Component("mailSender")
public class MailSender {

    /**
     * 容器事件由容器触发
     */
    @Resource
    private ApplicationContext applicationContext;

    public void sendMail(String to){
        log.info("MailSender开始发送邮件");
        MailSendEvent event = new MailSendEvent(applicationContext,to);
        applicationContext.publishEvent(event);
    }

}
