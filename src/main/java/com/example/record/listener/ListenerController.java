package com.example.record.listener;

import com.example.record.listener.custom.MailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author rui.zhou
 * @date 2021/05/03 20:37
 */
@RestController
@RequestMapping("/listener")
public class ListenerController {

    @Resource
    private MailSender mailSender;

    @RequestMapping("/test")
    public String test(){
        return "this is listener test";
    }

    @RequestMapping(value="/session",method= RequestMethod.GET)
    public void destorySession(HttpServletRequest request) {
        HttpSession session=request.getSession();
        session.invalidate();
    }

    @RequestMapping(value="/api/v2/listener",method=RequestMethod.GET)
    public void testDefinedListener(HttpServletRequest request) {
        mailSender.sendMail("北京");
    }

}


