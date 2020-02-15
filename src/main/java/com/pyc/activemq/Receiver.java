//IntelliJ IDEA
//ActiveMQ
//Receiver
//2020/2/15
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @JmsListener(destination = "my-destination")
    public void receiverMessage(String message){
        System.out.println("接收到：<" + message + ">");
    }
}
