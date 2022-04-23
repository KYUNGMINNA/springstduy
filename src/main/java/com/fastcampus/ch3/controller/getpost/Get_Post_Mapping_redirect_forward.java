package com.fastcampus.ch3.controller.getpost;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
public class Get_Post_Mapping_redirect_forward {
    @GetMapping("/get_post/getmapping")
    public void getmap(){

    }

    @PostMapping("/get_post/postmapping")
    public void postmap(){

    }

    // redirect  ,forward는 URL로 연결 해야 한다.
    @GetMapping("/get_post/getmapping/redirectpage")
    public String  get_redirect(String id) throws UnsupportedEncodingException {
        String a= URLEncoder.encode("redirect :URL주소 변경'//' 기존 '/'get_post'/'getmapping'/'redirectpage","utf-8");
        return "redirect:/get_post/getmapping?msg="+a;
    }

    @GetMapping("/get_post/getmapping/forward")
    public String  get_forward() {
        // get_post/getmapping/forward 으로 요청 했고 URL주소도 그대로 이지만  ,실제 나오는 화면은 getmaaping.jsp 파일이다
        return "forward:/get_post/getmapping";
    }


}
