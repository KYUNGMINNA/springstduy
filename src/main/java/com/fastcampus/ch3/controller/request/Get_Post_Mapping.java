package com.fastcampus.ch3.controller.request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
public class Get_Post_Mapping {
    @GetMapping("/get_post/getmapping")
    public void getmap(){

    }

    @PostMapping("/get_post/postmapping")
    public void postmap(){

    }
}
