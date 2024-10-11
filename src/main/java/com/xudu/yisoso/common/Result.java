package com.xudu.yisoso.common;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Result {

    private int code;

    private Object data;

    private  String message;

//    public Result(int code, Object data, String message){
//        this.code = code;
//        this.data = data;
//        this.message = message;
//
//    }
//
//    public Result(ErrorCode errorCode){
//        this.code = errorCode.getCode();
//        this.data = null;
//        this.message = errorCode.getMessage();
//    }
//
//    public Result() {
//
//    }

    // 成功返回信息
    public static Result success(Object data){
        return Result.builder()
                .code(200)
                .data(data)
                .message("ok")
                .build();
    }

    // 返回成功不反回数据，返回自定义成功信息
    public static Result success(String message){
        return Result.builder()
                .code(200)
                .data(null)
                .message(message)
                .build();
    }

    // 错误返回信息
    // 错误返回信息
    public static Result error(ErrorCode errorCode){
        return Result.builder()
                .code(errorCode.getCode())
                .data(null)
                .message(errorCode.getMessage())
                .build();

    }

    public static Result error(ErrorCode errorCode, String message){
        return Result.builder()
                .code(errorCode.getCode())
                .message(message)
                .build();

    }


    public static Result error(int code, String message) {
        return Result.builder()
                .code(code)
                .data(null)
                .message(message)
                .build();
    }






}