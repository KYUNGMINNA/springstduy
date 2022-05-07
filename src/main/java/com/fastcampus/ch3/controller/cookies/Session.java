package com.fastcampus.ch3.controller.cookies;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class Session {

    @GetMapping("/session_checks")
    public String list(HttpSession session){

        if(!sessionCehck(session)){
            return "cookies/login_before";

        }

        return "cookies/session_check";
    }

    private boolean sessionCehck(HttpSession session) {
        return session.getAttribute("id")!=null;
    }
}
