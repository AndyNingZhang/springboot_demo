package com.example.demo.rabbitMq;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
/**
 * 路径：com.example.demo.rabbitmq.controller
 * 类名：
 * 功能：《用一句描述一下》
 * 备注：单生产者-单消费者
 * 创建人：typ
 * 创建时间：2018/9/23 22:35
 * 修改人：
 * 修改备注：
 * 修改时间：
 */
@RestController
public class RabbitOneToOneTest {
 
    @Autowired
    private HelloSender helloSender;
 
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public void hello(){
        helloSender.send();
    }
}
