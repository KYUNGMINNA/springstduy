package com.fastcampus.ch3.conversion;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class conversion {


    //변환기  propertiyeditor | converter | Formatter 3 종류 있다.
    @InitBinder
    public void todate(WebDataBinder webDataBinder){
        //이게  propertiyeditor
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(df,false));
        webDataBinder.registerCustomEditor(String[].class,new StringArrayPropertyEditor("."));

    }

    @GetMapping("/conversion")
    public String main(){
        return "conversion_validation/conversion_before";
    }

    @PostMapping("/conversion")
    public String main2(User user, BindingResult result){
        System.out.println("result = " + result);
        System.out.println("user = " + user);
        return "conversion_validation/conversion_after";
    }



}
