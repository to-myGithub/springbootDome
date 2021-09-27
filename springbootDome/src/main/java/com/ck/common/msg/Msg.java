package com.ck.common.msg;

import com.ck.common.constant.Constants;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 封装 返回结果
 *
 * @author ck
 * @since 14:24 2021/9/27
 */
@Getter
@Setter
public class Msg<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int code = 0;

    private String msg;

    private T data;

    public static <T> Msg<T> ok() {
        return restResult(Constants.ONE, null, null);
    }

    public static <T> Msg<T> ok(T data) {
        return restResult(Constants.ONE, null, data);
    }

    public static <T> Msg<T> failed() {
        return restResult(Constants.ZERO, null, null);
    }

    public static <T> Msg<T> failed(T data) {
        return restResult(Constants.ZERO, null, data);
    }

    public static <T> Msg<T> failed(String msg) {
        return restResult(Constants.ZERO, msg, null);
    }

    public static <T> Msg<T> failed(int code) {
        return restResult(code, null, null);
    }

    public static <T> Msg<T> failed(int code, String msg) {
        return restResult(code, msg, null);
    }

    private static <T> Msg<T> restResult(int code, String msg, T data) {
        Msg<T> apiResult = new Msg<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

    public boolean is(Msg target) {
        return this.getCode() == target.getCode();
    }
}
