package com.fastcampus.ch3.conversion;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Arrays;
import java.util.Date;

public class User {


    //@DateTimeFormat(pattern = "yyyy/MM/dd")  --이거 사용하려면 conversion.java 파일에서   SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
                                                      //        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(df,false)); 두줄 주석처리 해야 한다.
    private Date date;

    public Date getDate() {return date;}

    public void setDate(Date date) {this.date = date;}

    private  String[] lis;

    public String[] getLis() {
        return lis;
    }

    public void setLis(String[] lis) {
        this.lis = lis;
    }

    @Override
    public String toString() {
        return "User{" +
                "date=" + date +
                ", lis=" + Arrays.toString(lis) +
                '}';
    }
}
