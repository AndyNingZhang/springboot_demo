package com.example.demo.rabbitMq;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/**
*@Descripption  单对单对接消费
*@Author:zn
*@CreateDate:2019/7/10/010 9:46
*@UpdateDate:2019/7/10/010 9:46
*Version:1.0
*/

@Component
public class HelloReceiver {

    private static final Logger log = LoggerFactory.getLogger(HelloReceiver.class);

    //监听器监听指定的Queue
    @RabbitListener(queues = "hello")
    public void process(String hello) {
        log.info("Receiver:" + hello);

    }
}