package com.yj.auto.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result<T> {

    private String code;

    private String msg;

    private T data;

    public static <T> Result<T> success(T data){
        return Result.<T>builder()
                .data(data)
                .code("200")
                .msg("操作成功")
                .build();
    }

    public static  Result error(String errorCode, String errorMsg){
        return Result.builder()
                .code(errorCode)
                .msg(errorMsg)
                .build();
    }
}
