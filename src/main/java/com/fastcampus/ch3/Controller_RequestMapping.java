package com.fastcampus.ch3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class Controller_RequestMapping {

    @RequestMapping("/first")
    public void requestmapping(HttpServletResponse httpServletResponse) throws IOException {
        System.out.println("hello spring :" +"hello spring");

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
        printWriter.println("<h1>first Srping </h1>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }

}
