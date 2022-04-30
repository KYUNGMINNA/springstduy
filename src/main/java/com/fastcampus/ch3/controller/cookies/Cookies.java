package com.fastcampus.ch3.controller.cookies;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class Cookies {

    @GetMapping("/cookie_get")
    public String cookie_get() {
        return "cookies/login_cookie";
    }

    @PostMapping("/cookie_get")
    public String cookie_post(String id, String password,
                              boolean cookiecheck, HttpServletResponse response, HttpSession session) {
        System.out.println("id = " + id);
        System.out.println("password = " + password);
        System.out.println("cookiecheck = " + cookiecheck);

        session.setAttribute("id",id);

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


        return "redirect:/login_after";  // redirect는 요청 URL을 전달하는것이라
                                        // URL을 처리할 메서드가 있어야 함 그래서 오류  XXXXXX

        //쿠키 테스트
        //return "redirect:/login_cookie_after"; // 리턴값에 해당하는 요청을 처리하는 메서드가 존재하여 정상동작 OK

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


        //로그인 후 쿠키 적용 테스트 : getmapping , postmapping 둘다 가능
//        @RequestMapping("/login_cookie_after")
//        public String login_cookie_after(){
//            return "cookies/login_after";
//        }
        @GetMapping("/login_cookie_after")   // cookie_get -> login_after 정상 전환
        public String login_cookie_after(){
            return "cookies/login_after";  // redirect 쓰려면 리턴값에 해당하는 메서드를 새로 만들어야 함

       }
    
    
//        @PostMapping("/login_cookie_after") //- Request method 'GET' not supported 오류 발생 --
//        public String login_cookie_after(){
//            return "cookies/login_after";
//        }


}





