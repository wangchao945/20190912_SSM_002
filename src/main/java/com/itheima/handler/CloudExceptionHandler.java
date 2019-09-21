package com.itheima.handler;

import com.itheima.domain.RspBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CloudExceptionHandler {
    @ExceptionHandler(value = {Exception.class})
    @ResponseBody
    public RspBean handleOtherExceptions(final Exception ex) {
        RspBean rspBean = new RspBean(ex);
        if (ex instanceof RuntimeException) {
            return new RspBean(ex);
        } else if (ex instanceof Exception) {
            return new RspBean(ex);
        } else {
            return new RspBean(ex);
        }
    }
}
