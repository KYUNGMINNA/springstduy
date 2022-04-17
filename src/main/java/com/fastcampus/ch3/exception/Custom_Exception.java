package com.fastcampus.ch3.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.UNAUTHORIZED)
class MyException extends RuntimeException{
    MyException(){
        this("");
    }
    MyException(String messgae){
        super(messgae);
    }
}

class MyException2 extends RuntimeException{
    MyException2(){
        this("");
        System.out.println("기본생성자 호출");
    }
    MyException2(String messgae){
        super(messgae);
    }


}
@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
class MyException3 extends RuntimeException{
    MyException3(){
        this("");
        System.out.println("기본생성자 호출");
    }
    MyException3(String messgae){
        super(messgae);
    }
}

class MyException4 extends RuntimeException{
    MyException4(){
        this("");
        System.out.println("기본생성자 호출");
    }
    MyException4(String messgae){
        super(messgae);
    }
}
@ResponseStatus(HttpStatus.BAD_GATEWAY)
class MyException5 extends RuntimeException{
    MyException5(){
        this("");
        System.out.println("기본생성자 호출");
    }
    MyException5(String messgae){
        super(messgae);
    }
}

@Controller
public class Custom_Exception {

    @RequestMapping("/myexception_error401_webxml")
    public void exception_throw4() throws Exception{
        System.out.println("throw custom MyException ");
        throw new MyException("사용자 정의 메서드 ");
    }

    @RequestMapping("/myexception_error500_views_error_jsp")
    public void exception_throw5() throws Exception{
        System.out.println("throw custom MyException2 ");
        throw new MyException2("사용자 정의 메서드 ");
    }
    @RequestMapping("/myexception_error501_webxml")
    public void exception_throw6() throws Exception{
        System.out.println("throw custom MyException3 :: error501.jsp ");
        throw new MyException3("사용자 정의 메서드 ");
    }
    @RequestMapping("/myexception_error405_to_399_servletcontext")
    public void exception_throw7() throws Exception{
        System.out.println("throw custom MyException4 ");
        throw new MyException4("사용자 정의 메서드 ");
    }
    @RequestMapping("/myexception_error502_webxml")
    public void exception_throw8() throws Exception{
        System.out.println("throw custom MyException5 ");
        throw new MyException5("사용자 정의 메서드 ");
    }
}
