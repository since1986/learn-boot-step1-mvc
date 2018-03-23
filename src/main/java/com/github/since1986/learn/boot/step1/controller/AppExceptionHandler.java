package com.github.since1986.learn.boot.step1.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

//全局异常处理
@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Map<String, Object> handleException(Exception exception) {
        exception.printStackTrace();
        Map<String, Object> response = new HashMap<>();
        response.put("message", exception.getMessage());
        response.put("code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        return response;
    }
}