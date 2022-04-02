package com.fastcampus.ch3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Request_Yesparameter {
    @RequestMapping("/request_mvc_jsp")// http://localhost/ch3/request_mvc_jsp?year=2022&month=04&day=2&hour=23
    public String request_String_yes_p(int year,int month,int day,String hour){
                           //==(RequestParam int year,@RequestParam int month,@RequestParam int day,@RequestParam String hour);
        return "String_Void_MV_YES_P/request_string_yes_p";
    }
    @RequestMapping("/request_mvc_jsp2") // http://localhost/ch3/request_mvc_jsp2?year=2022&month=04&day=2&hour=23
    public String request_String_yes_p2(int year, int month, int day, String hour, Model model){
                           //==(RequestParam int year,@RequestParam int month,@RequestParam int day,@RequestParam String hour,Model model);
        model.addAttribute("YEAR",year);
        model.addAttribute("MONTH",month);
        model.addAttribute("DAY",day);
        model.addAttribute("HOUR",hour);


        return "String_Void_MV_YES_P/request_string_yes_p2";
    }

    @RequestMapping("/String_Void_MV_YES_P/request_string_yes_p")
    public void request_void_yes_p(int year, int month, int day, String hour){

    }
    @RequestMapping("/String_Void_MV_YES_P/request_string_yes_p2")
    public void request_void_yes_p2(int year, int month, int day, String hour,Model model){
        model.addAttribute("YEAR",year);
        model.addAttribute("MONTH",month);
        model.addAttribute("DAY",day);
        model.addAttribute("HOUR",hour);

    }

    @RequestMapping("/request_mvc_modelandview")  //http://localhost/ch3/request_mvc_modelandview?year=2022&month=04&day=2&hour=23
    public ModelAndView requestm_modelandview_yes_p(int year, int month, int day, String hour) {

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("String_Void_MV_YES_P/request_string_yes_p");
        modelAndView.addObject("year",year);
        modelAndView.addObject("month",month);
        modelAndView.addObject("day",day);
        modelAndView.addObject("hour",hour);

        return modelAndView;
    } @RequestMapping("/request_mvc_modelandview2")  //http://localhost/ch3/request_mvc_modelandview?year=2022&month=04&day=2&hour=23
    public ModelAndView requestm_modelandview_yes_p2(int year, int month, int day, String hour) {

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("String_Void_MV_YES_P/request_string_yes_p2");
        modelAndView.addObject("YEAR",year);
        modelAndView.addObject("MONTH",month);
        modelAndView.addObject("DAY",day);
        modelAndView.addObject("HOUR",hour);

        return modelAndView;
    }

    //  <view-controller path="/view_yes_p" view-name="String_Void_MV_YES_P/request_string_yes_p" />
    //    http://localhost/ch3/view_yes_p?year=2022&month=04&day=2&hour=23

    //기본형, String 타입의 파라미터 테스트
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

}
