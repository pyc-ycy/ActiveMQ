//IntelliJ IDEA
//ActiveMQ
//Msg
//2020/2/15
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc.activemq;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

public class Msg implements MessageCreator {
    @Override
    public Message createMessage(Session session) throws JMSException {
        return session.createTextMessage("A message of testing");
    }
}
