package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XiaomingController {

    @RequestMapping(value = "/xiaoming")
    public String  say(){
        return "xiaoming";
    }
}
