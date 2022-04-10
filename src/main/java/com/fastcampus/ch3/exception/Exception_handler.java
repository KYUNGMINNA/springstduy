package com.fastcampus.ch3.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.net.http.WebSocketHandshakeException;
import java.security.GeneralSecurityException;

@Controller
public class Exception_handler {
    @ExceptionHandler({NullPointerException.class,ArithmeticException.class})
    public String excption_handle(NullPointerException nullPointerException,
                                  ArithmeticException arithmeticException,
                                  Model model){
        System.out.println("exceptionHandler Called");
        model.addAttribute("NULLPointerException",nullPointerException);

        return "Exception/exception_local_handle2";
    }

    @RequestMapping("/local_nullpoint_exception_throw")
    public void exception_throw() throws NullPointerException{
        System.out.println("throw NullpointException ");
        throw new NullPointerException("로컬 널포인트 에러 메시지 ");
    }

    /////////////////////////////////

    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ExceptionHandler(IndexOutOfBoundsException.class)
    public String excption_handle2(IndexOutOfBoundsException indexOutOfBoundsException,
                                  Model model){
        System.out.println("에러코드 상태 변환하기");
        model.addAttribute("INDEX",indexOutOfBoundsException);

        return "Exception/exception_status_change";
    }

    @RequestMapping("/local_index_exception_throw")
    public void exception_throw2() throws IndexOutOfBoundsException{
        System.out.println("throw IndexOutOfBoundsException ");
        throw new IndexOutOfBoundsException("로컬 인덱스 에러 메시지 ");
    }


    //////////////////////////////////////////
    @RequestMapping("/global_exception_exception_throw")
    public void exception_throw3() throws SecurityException{
        System.out.println("throw Exception ");
        throw new SecurityException("글로벌 예외 에러 메시지 ");
    }

    @RequestMapping("/try_catch_exception_handle")
    public String try_catch_exception_handle() throws Exception {
        try{
            throw new Exception("아무 오류발생");
        }catch (Exception exception){
            return "Exception/exception_try_catch";
        }

    }




}
