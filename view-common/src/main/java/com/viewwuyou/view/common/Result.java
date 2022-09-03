package com.viewwuyou.view.common;

import lombok.Data;

/**
 * @author viewwuyou
 */
@Data
public class Result<T> {
    private T data;

    private Boolean success;

    private String code;

    private String msg;

    public static <T> Result<T> ofSuccess(T data, String code, String msg) {
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setData(data);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> ofSuccess(T data) {
        return Result.ofSuccess(data, "200", "success");
    }

    public static <T> Result<T> ofSuccess() {
        return Result.ofSuccess(null);
    }

    public static <T> Result<T> ofFail(String code, String msg) {
        Result<T> result = new Result<>();
        result.setSuccess(false);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> ofFail(String msg) {
        return Result.ofFail("200", msg);
    }

    public static <T> Result<T> ofFail() {
        return Result.ofFail("SYSTEM_ERROR");
    }

}
