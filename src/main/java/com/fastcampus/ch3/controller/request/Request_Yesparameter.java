package com.fastcampus.ch3.controller.request;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Request_Yesparameter {
    @RequestMapping("/request_mvc_jsp")
    public String request_String_yes_p(int year,int month,int day,String hour){
                           //==(RequestParam int year,@RequestParam int month,@RequestParam int day,@RequestParam String hour);
        return "request_yes_parameter/request_string_yes_no_model";
    }
    @RequestMapping("/request_mvc_jsp2")
    public String request_String_yes_p2(int year, int month, int day, String hour, Model model){
                           //==(RequestParam int year,@RequestParam int month,@RequestParam int day,@RequestParam String hour,Model model);
        model.addAttribute("YEAR",year);
        model.addAttribute("MONTH",month);
        model.addAttribute("DAY",day);
        model.addAttribute("HOUR",hour);


        return "request_yes_parameter/request_string_yes_model";
    }

    @RequestMapping("/request_yes_parameter/request_string_yes_no_model")
    public void request_void_yes_p(int year, int month, int day, String hour){

    }
    @RequestMapping("/request_yes_parameter/request_string_yes_model")
    public void request_void_yes_p2(int year, int month, int day, String hour,Model model){
        model.addAttribute("YEAR",year);
        model.addAttribute("MONTH",month);
        model.addAttribute("DAY",day);
        model.addAttribute("HOUR",hour);

    }

    @RequestMapping("/request_mvc_modelandview")
    public ModelAndView requestm_modelandview_yes_p(int year, int month, int day, String hour) {

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("request_yes_parameter/request_string_yes_model");
        modelAndView.addObject("YEAR",year);
        modelAndView.addObject("MONTH",month);
        modelAndView.addObject("DAY",day);
        modelAndView.addObject("HOUR",hour);

        return modelAndView;
    } @RequestMapping("/request_mvc_modelandview2")
    public ModelAndView requestm_modelandview_yes_p2(int year, int month, int day, String hour) {

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("request_yes_parameter/request_string_yes_model");
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



    //객체형 타입의 파라미터 테스트
    @RequestMapping("/request_obejct")
    public String request_String_yes_p(Info info) {
                                  //== @ModelAttribute Info info == @ModelAttribute("info") Info info
        return "request_yes_parameter/request_object_yes_no_model";
    }
    @RequestMapping("/request_obejct2")
    public String request_String_yes_p2(Info info, Model model){
        model.addAttribute("INFO",info);


        return "request_yes_parameter/request_object_yes_model";
    }
    @RequestMapping("/request_obejct3")
    public String request_String_yes_p3(Info info, BindingResult result){

        return "request_yes_parameter/request_object_yes_no_model";
    }

    @RequestMapping("/request_yes_parameter/request_object_yes_no_model")
    public void request_void_yes_p(Info info){

    }
    @RequestMapping("/request_yes_parameter/request_object_yes_model")
    public void request_void_yes_p2(@ModelAttribute("INfo") Info info,Model model){
        model.addAttribute("INFO",info);

    }

    @RequestMapping("/request_object_modelandview")
    public ModelAndView requestm_modelandview_yes_p(Info info) {

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("request_yes_parameter/request_object_yes_model");
        modelAndView.addObject("INFO",info);

        return modelAndView;
    }
    @RequestMapping("/request_object_modelandview2")
    public ModelAndView requestm_modelandview_yes_p2(@ModelAttribute("INfo") Info info) {

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("request_yes_parameter/request_object_yes_model");
        modelAndView.addObject("INFO",info);

        return modelAndView;
    }










}
