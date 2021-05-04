package com.example.record.pattern.proxy.dynamic;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 定义一个处理器
 * @author rui.zhou
 * @date 2021/05/03 16:36
 */
@Slf4j
public class MyInvocationHandler implements InvocationHandler {

    /**
     * 因为需要处理真实角色，所以要把真实角色传进来
     */
    Subject realSubject ;

    public MyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("调用代理类");
        if("sellBooks".equals(method.getName())){
            int invoke = (int)method.invoke(realSubject, args);
            log.info("调用的是卖书的方法");
            return invoke ;
        }else {
            String string = (String) method.invoke(realSubject,args) ;
            log.info("调用的是说话的方法");
            return  string ;
        }
    }

    public static void main(String[] args) {
        //真实对象
        Subject realSubject =  new RealSubject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
        //代理对象
        Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);

        proxyClass.sellBooks();

        proxyClass.speak();
    }
}
