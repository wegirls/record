package com.example.record.listener.custom;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author rui.zhou
 * @date 2021/05/03 21:02
 */
@Slf4j
@Component
public class MailSendListener implements ApplicationListener<MailSendEvent> {
    @Override
    public void onApplicationEvent(MailSendEvent mailSendEvent) {
        log.info("向"+ mailSendEvent.getTo()+ "发送了一封邮件");
    }
}
