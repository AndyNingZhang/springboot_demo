package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/springboot")
public class UserController {
    //这里使用@RequestMapping注解表示该方法对应的二级上下文路径
    @RequestMapping(value = "/getUserNameByGet",method = RequestMethod.POST)
    String getUserByGet(@RequestBody String userName){
        System.out.println("请求接收到。。。。。");
        return userName;
    }

}
