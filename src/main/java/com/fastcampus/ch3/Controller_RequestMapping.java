package com.fastcampus.ch3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class Controller_RequestMapping {

    @RequestMapping("/request")
    public void request_default(HttpServletResponse httpServletResponse) throws IOException {

        httpServletResponse.setContentType("text/html");
        httpServletResponse.setCharacterEncoding("utf-8");
        PrintWriter printWriter=httpServletResponse.getWriter();

        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>");
        printWriter.println("first_spring");
        printWriter.println("</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<h1>@Requestmapping('/request')</h1>");
        printWriter.println("<h1>httpServletResponse.setContentType('text/html');</h1>");
        printWriter.println("<h1>httpServletResponse.setCharacterEncoding('utf-8');</h1>");
        printWriter.println("<h1>PrintWriter printWriter=httpServletResponse.getWriter();</h1>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }

    //-------------------------------------------

    @RequestMapping("/request_mvc_jsp")
    public String request_mvc_jsp(){

        return "request_mvc_jsp";
    }
    @RequestMapping("/request_mvc_void")
    public void request_mvc_void(){

    }
    @RequestMapping("/request_mvc_modelandview")
    public ModelAndView requestm_mvc_modelandview() {

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("request_mvc_modelandview");

        return modelAndView;
    }







}
