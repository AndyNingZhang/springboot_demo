package com.example.demo.rabbitMq;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
 
/**
 * 路径：com.example.demo.rabbitmq.service
 * 类名：
 * 功能：消费者1
 * 备注：多生产者-多消费者
 * 创建人：typ
 * 创建时间：2018/9/23 22:14
 * 修改人：
 * 修改备注：
 * 修改时间：
 */
@Component
public class HelloReceiverA {
 
    private static final Logger log = LoggerFactory.getLogger(HelloReceiverA.class);
 
    //监听器监听指定的Queue
    @RabbitListener(queues="hello")
    public void process(String hello){
        log.info("ReceiverA:"+hello);
    }
 
}