package com.fastcampus.ch3.controller.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class Request_Noparameter {



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


    @RequestMapping("/request_string")
    public String request_string(){

        return "String_Void_MV_NO_P/request_string";
    }
    @RequestMapping("/String_Void_MV_NO_P/request_void")
    public void request_void(){

    }
    @RequestMapping("/request_modelandview")
    public ModelAndView request_modelandview() {

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("String_Void_MV_NO_P/request_modelandview");

        return modelAndView;
    }
    //servlet-context.xml에 <view-controller path="/view_controller" view-name="view_controller" />








}
