package com.pyc.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class ActivemqApplication implements CommandLineRunner {
    // implement CommandLinerRunner and overwrite Run method
    //so that can execute our code when program start
    @Autowired
    JmsTemplate jmsTemplate;

    @Override
    public void run(String... args) throws Exception {
        jmsTemplate.send("my-destination", new Msg());
    }

    public static void main(String[] args) {
        SpringApplication.run(ActivemqApplication.class, args);
    }

}
