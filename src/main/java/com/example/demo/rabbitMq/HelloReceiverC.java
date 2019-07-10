package com.example.demo.rabbitMq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloReceiverC {

    private  static  final Logger log= LoggerFactory.getLogger(HelloReceiverC.class);

    //配置监听器监听指定的queue
    @RabbitListener(queues = "hello")
    public void process(String hello) {
        log.info("HelloReceiverC:"+hello);
    }
}
