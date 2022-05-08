package com.fastcampus.ch3.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;

public class SpringDI {

    public static void main(String[] args) {

        //직접 빈으로 등록
        ApplicationContext ac = new GenericXmlApplicationContext("applicationcontext.xml");

        //applicationcontext.xml bean scope="singloeton" 기본이 singleton이라 생략되어있음
        a_no_component a1=(a_no_component)ac.getBean("A_NO_COMPONENT");
        a_no_component a2=ac.getBean("A_NO_COMPONENT", a_no_component.class);
        //c1 ,c2 같은 문장

        a_no_component a3=(a_no_component)ac.getBean(a_no_component.class);


        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);

        //applicationcontext.xml bean scope="prototypr"
        b_no_compoent b1=(b_no_compoent)ac.getBean("b_no_compoent");
        b_no_compoent b2=(b_no_compoent)ac.getBean(b_no_compoent.class);
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        c_no_compoent_get_set_initialization c1=(c_no_compoent_get_set_initialization)ac.getBean("c_no_compoent_get_set_initialization");
        d_no_component_constructor_initalization d1=(d_no_component_constructor_initalization)ac.getBean("d_no_component_constructor_initalization");

        System.out.println("c1 = " + c1);
        System.out.println("d1 = " + d1);


    }
}
