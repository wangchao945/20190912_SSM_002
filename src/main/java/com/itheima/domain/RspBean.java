package com.itheima.domain;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Data
public class RspBean<T> implements Serializable{
    public static final String SUCCESS = "000000";
    public static final String FAIL = "000001";

    private String errorCode;
    private String errorMsg;
    private String rtnCode;
    private String rtnMsg;
    private T data;

    public RspBean(){
        super();
    }

    public RspBean(T data){
        this.data = data;
        this.rtnCode = SUCCESS;
        this.rtnMsg = "success";
    }

    public RspBean(Throwable e){
        this.errorCode = FAIL;
        this.errorMsg = e.toString();
    }

}
