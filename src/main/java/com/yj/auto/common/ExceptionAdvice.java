package com.yj.auto.common;

import com.yj.auto.exceptions.ServiceException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @ControllerAdvice是在类上声明的注解，其用法主要有三点：
 * @ExceptionHandler注解标注的方法：用于捕获Controller中抛出的不同类型的异常，从而达到异常全局处理的目的；
 *  @InitBinder注解标注的方法：用于请求中注册自定义参数的解析，从而达到自定义请求参数格式的目的；
 *  @ModelAttribute注解标注的方法：表示此方法会在执行目标Controller方法之前执行 。
 *
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler({ServiceException.class})
    @ResponseBody
    public Result handleServiceException(ServiceException serviceException){
        return Result.builder().code(serviceException.getCode().toString()).msg(serviceException.getMsg()).build();
    }

    @ExceptionHandler({IllegalArgumentException.class})
    @ResponseBody
    public Result handleIllegalArgumentException(IllegalArgumentException illegalArgumentException){
        return Result.builder().code("300").msg(illegalArgumentException.getMessage()).build();
    }


}
