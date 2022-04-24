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


        if (cookiecheck) {
            //1.쿠키를 생성
            Cookie cookie = new Cookie("id", id);
            //2.응답에 저장
            response.addCookie(cookie);
        } else {
            Cookie cookie = new Cookie("id", id);
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }


        return "redirect:/login_cookie_after";


        // 로그인 테스트
        //return "redirect:/login_after_get"-->요청 URL ::login_cookie_after_get  OK
        //return "forward:/login_after_post" -->요청 URL ::cookie_get              OK;

    }


        //로그인 redirect
        @GetMapping("/login_after_get")
        public String login_cookie_after_get() {
            return "cookies/login_cookie";
            //return "cookies/login_after";
        }
        //로그인 forward
        @PostMapping("/login_after_post")
        public String login_cookie_after_post () {
            return "cookies/login_after";
        }


        //로그인 후 쿠키 적용 테스트
        @RequestMapping("/login_cookie_after")
        public String login_cookie_after(){
            return "cookies/login_cookie";
        }

}





