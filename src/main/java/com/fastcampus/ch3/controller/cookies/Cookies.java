package com.fastcampus.ch3.controller.cookies;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;


@Controller
public class Cookies {

    @GetMapping("/cookie_get")
    public String cookie_get() {
        return "cookies/login_cookie";
    }

    @PostMapping("/cookie_get")
    public String cookie_post(String id, String password,
                              boolean cookiecheck, HttpServletResponse response) {
        System.out.println("id = " + id);
        System.out.println("password = " + password);
        System.out.println("cookiecheck = " + cookiecheck);





        return "redirect:/login_after_post";
    }


        //redirect 용
        @GetMapping("/login_after_get")
        public String login_cookie_after_get() {
            return "cookies/login_cookie";
            //return "cookies/login_after";
        }
        //forward용
        @PostMapping("/login_after_post")
        public String login_cookie_after_post () {
            return "cookies/login_after";
        }


}





