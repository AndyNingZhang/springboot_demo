package com.example.demo.rabbitMq;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
 
/**
*@Descripption
*@Author:zn
*@CreateDate:2019/7/10/010 10:43
*@UpdateDate:2019/7/10/010 10:43
*Version:1.0
*/

@RestController
public class RabbitOneToManyTest {
 
    @Autowired
    private HelloSender1 helloSender;
    

    @PostMapping("/oneToMany")
    public void ontToMany(){
        for (int i=0;i<10;i++){
            helloSender.send("hello smg:"+i);
        }
    }
}
