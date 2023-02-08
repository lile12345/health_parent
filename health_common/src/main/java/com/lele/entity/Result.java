package com.lele.entity;

import java.io.Serializable;

/**
 * 封装返回结果类
 */

public class Result implements Serializable {
    private boolean flag; //true为执行成功,false 为执行失败
    private String message; //返回提示信息
    private Object data; //返回数据

    public Result(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public Result(boolean flag, String message, Object data) {
        this.flag = flag;
        this.message = message;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
