package com.fastcampus.ch3.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


//// Custom 예외 만들어 사용하려면 Global Exception 애너테이션 주석 처리 해야 함
@ResponseStatus(HttpStatus.UNAUTHORIZED)
class MyException extends RuntimeException{
    MyException(){
        this("");
    }
    MyException(String messgae){
        super(messgae);
    }
}

//views-> error.jsp 파일로 이동
class MyException2 extends RuntimeException{
    MyException2(){
        this("");
        System.out.println("기본생성자 호출");
    }
    MyException2(String messgae){
        super(messgae);
    }


}@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
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

@Controller
public class Custom_Exception {

    @RequestMapping("/mycustom401_exception_throw")
    public void exception_throw4() throws Exception{
        System.out.println("throw custom MyException ");
        throw new MyException("사용자 정의 메서드 ");
    }

    @RequestMapping("/mycustomdefault_exception_throw")
    public void exception_throw5() throws Exception{
        System.out.println("throw custom MyException2 ");
        throw new MyException2("사용자 정의 메서드 ");
    }
    @RequestMapping("/mycustom501_exception_throw")
    public void exception_throw6() throws Exception{
        System.out.println("throw custom MyException3 ");
        throw new MyException3("사용자 정의 메서드 ");
    }
    @RequestMapping("/mycustom_error405_to_399")
    public void exception_throw7() throws Exception{
        System.out.println("throw custom MyException4 ");
        throw new MyException4("사용자 정의 메서드 ");
    }
}
