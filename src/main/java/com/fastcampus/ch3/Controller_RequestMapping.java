package com.fastcampus.ch3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/common")
public class Controller_RequestMapping {

    @RequestMapping("/requestmapping")
    public void requestmapping_get(HttpServletResponse httpServletResponse) throws IOException {
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
        printWriter.println("@Requestmapping('/first')");
        printWriter.println("Only Get request");


        printWriter.println("<p style='color:pink; font-size: 30px'>first Srping </p>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
    @RequestMapping(value = "/requestmapping_views_false",method=RequestMethod.GET)
    public String requestmapping_views(@RequestParam(required = false) int year,
                                       @RequestParam(name = "month",required = false) int month,
                                       int day, Model model){
        model.addAttribute("year",year);
        model.addAttribute("month",month);
        model.addAttribute("day",day);
        return "getrequest_Int";
    }    @RequestMapping(value = "/requestmapping_views_requiered_true",method=RequestMethod.GET)
    public String requestmapping_views_param(@RequestParam int year,
                                             @RequestParam(required = true) int month,
                                             @RequestParam(name = "day",required = true) int day, Model model){
        model.addAttribute("year",year);
        model.addAttribute("month",month);
        model.addAttribute("day",day);
        return "getrequest_Int";
    }

}
