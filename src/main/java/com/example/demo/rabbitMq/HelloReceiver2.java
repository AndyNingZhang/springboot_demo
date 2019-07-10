package com.example.demo.rabbitMq;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
 
/**
 * 路径：com.example.demo.rabbitmq.service
 * 类名：
 * 功能：消费者2
 * 备注：单生产者-多消费者
 * 创建人：typ
 * 创建时间：2018/9/23 22:14
 * 修改人：
 * 修改备注：
 * 修改时间：
 */
@Component
public class HelloReceiver2 {
 
    private static final Logger log = LoggerFactory.getLogger(HelloReceiver2.class);
 
    //监听器监听指定的Queue
    @RabbitListener(queues="hello")
    public void process(String hello){
        log.info("Receiver2:"+hello);
 
    }
 
}
