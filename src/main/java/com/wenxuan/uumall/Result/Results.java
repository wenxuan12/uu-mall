package com.wenxuan.uumall.Result;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Results<T> implements Serializable {

    private int code;

    private String msg;

    private T data;

    private Results() {

    }

    private Results(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Results(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <R> Results<R> success(){
        return success(null);
    }

    public static <R> Results<R> success(R data){
        return new Results(200,"success",data);
    }

    public static <R> Results<R> error() {
        return error(0,"发生未知错误");
    }

    public static <R> Results<R> error(String message) {
        return error(0,message);
    }

    public static <R> Results<R> error(int code, String message) {
        return new Results(code, message);
    }
}
