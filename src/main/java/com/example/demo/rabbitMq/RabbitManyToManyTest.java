package com.example.demo.rabbitMq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitManyToManyTest {

    private  static  final Logger log=LoggerFactory.getLogger(RabbitManyToManyTest.class);

    @Autowired
    private  HelloSenderA helloSenderA;

    @Autowired
    private  HelloSenderB helloSenderB;

    @PostMapping("/manyToMany")
    public void sendHello() {
        for (int i=0;i<10;i++){
            helloSenderA.send("hello smg:"+i);
            helloSenderB.send("hello smg:"+i);
        }
    }

}
