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



        System.out.println("///////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////////////////////////////////////////////////////");



        //자동 빈으로 등록
        ApplicationContext ac2 = new GenericXmlApplicationContext("applicationcontext_component_scan.xml");
        //Componet-scan 있어야 함 ::빈을 직접 등록안해도 되기 때문 (물론 직접 등록해도 된다)

        //Autowired는 타입으로 찾기 때문에 ~~~.class 로 해야 함
        g_yes_component ggg=(g_yes_component)ac2.getBean(g_yes_component.class);
        HHH_yes_component hhh=(HHH_yes_component)ac2.getBean(HHH_yes_component.class);
        QQQ_yes_component qqq=(QQQ_yes_component)ac2.getBean(QQQ_yes_component.class);


        TTTT_yes_component_method ttt=(TTTT_yes_component_method)ac2.getBean(TTTT_yes_component_method.class);


        System.out.println("ggg = " + ggg);
        System.out.println("ggg.hhh_yes_component = " + ggg.hhh_yes_component);
        System.out.println("ggg.qqq_yes_component = " + ggg.qqq_yes_component);
        System.out.println("ggg.kkk_yes_component = " + ggg.kkk_yes_component);
        System.out.println("Arrays.toString(ggg.kkk_yes_components_array) = " + Arrays.toString(ggg.kkk_yes_components_array));
        System.out.println("ggg.tttt_yes_component_method = " + ggg.tttt_yes_component_method);
        System.out.println("----------------------------------------------------------------");
        System.out.println("hhh = " + hhh);
        System.out.println("qqq = " + qqq);
        System.out.println("ttt = " + ttt);


//        이미 위에서 선언되어 있어서 중복으로 선언되었기 때문에 오류가 발생하여 동작 안함
//        KKK_yes_component kkk=(KKK_yes_component)ac2.getBean(KKK_yes_component.class);
//        kkk_1 kkk1=(kkk_1)ac2.getBean(kkk_1.class);
//        kkk_2 kkk2=(kkk_2)ac2.getBean(kkk_2.class);
//        kkk_3 kkk3=(kkk_3)ac2.getBean(kkk_3.class);

//        System.out.println("kkk = " + kkk);
//        System.out.println("kkk1 = " + kkk1);
//        System.out.println("kkk2 = " + kkk2);
//        System.out.println("kkk3 = " + kkk3);

    }
}
