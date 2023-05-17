package com.moonlightqz.mymall.model.vo;


import com.moonlightqz.mymall.enums.ResultCode;

/**
 * 统一整个项目中Ajax请求返回的结果（未来也可以用于分布式架构各个模块间调用时返回统一类型）
 *
 * @author 陌溪
 * @date 2020年9月9日18:39:51
 */

public class Result<T> {

    /**
     * 状态码，比如 200 代表响应成功
     */
    private Integer code;

    /**
     * 响应信息，用来说明响应情况
     */
    private String message;

    /**
     * 响应的具体数据
     */
    private T data;

    public Result() {

    }

    public Result(T data) {
        this(ResultCode.SUCCESS, data);
    }

    public Result(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMsg();
        this.data = data;
    }

    public Result(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    /**
     * 请求处理成功且不需要返回数据时使用的工具方法
     *
     * @return
     */
    public static <Type> Result<Type> successWithoutData() {
        return successWithData(null);
    }

    /**
     * 请求处理成功且需要返回数据时使用的工具方法
     *
     * @param data 要返回的数据
     * @return
     */
    public static <Type> Result<Type> successWithData(Type data) {
        return new Result<Type>(ResultCode.SUCCESS, data);
    }

    public static Result successWithMsg(String message) {
        return new Result(ResultCode.SUCCESS.getCode(), message);
    }

    public static Result failedWithMsg(String message) {
        return new Result(ResultCode.FAILED.getCode(), message);
    }

    /**
     * 请求处理失败后使用的工具方法
     *
     * @return
     */
    public static <Type> Result<Type> failed() {
        return new Result<Type>(ResultCode.FAILED, null);
    }

    /**
     * 请求处理失败后使用的工具方法
     *
     * @param resultCode
     * @param <Type>
     * @return
     */
    public static <Type> Result<Type> failed(ResultCode resultCode) {
        return new Result<Type>(resultCode, null);
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "code=" + code +
                ", msg='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

