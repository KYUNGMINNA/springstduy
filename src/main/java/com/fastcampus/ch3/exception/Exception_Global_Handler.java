package com.fastcampus.ch3.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice("com.fastcampus.ch3")
@ControllerAdvice
public class Exception_Global_Handler {
    @ExceptionHandler(SecurityException.class)
    public String glboal_handle(SecurityException securityException){

        return "Exception/exception_global_handle";

  }
}
