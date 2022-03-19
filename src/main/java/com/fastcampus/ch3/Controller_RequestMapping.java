package com.fastcampus.ch3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller_RequestMapping {

    @RequestMapping("/first")
    public void requestmapping(){
        System.out.println("hello spring :" +"hello spring");

    }

}
