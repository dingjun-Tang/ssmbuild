package com.dgut.util;

import java.util.HashMap;
import java.util.Map;

public class Result {

    private Boolean success;

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<String, Object>();

    // 操作成功
    public static Result success(){
        Result result = new Result();
        result.setSuccess(ResultEnum.SUCCESS.getSuccess());
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMessage(ResultEnum.SUCCESS.getMessage());
        return result;
    }

    // 发生错误
    public static Result error(){
        Result result = new Result();
        result.setSuccess(ResultEnum.ERROR.getSuccess());
        result.setCode(ResultEnum.ERROR.getCode());
        result.setMessage(ResultEnum.ERROR.getMessage());
        return result;
    }

    // 根据枚举量设置返回结果
    public static Result setResult(ResultEnum resultEnum){
        Result result = new Result();
        result.setSuccess(resultEnum.getSuccess());
        result.setCode(resultEnum.getCode());
        result.setMessage(resultEnum.getMessage());
        return result;
    }

    // 单独设置成功值
    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    // 单独设置信息
    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    // 单独设置状态码
    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    // 单独设置数据
    public Result data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    // 单独替换数据
    public Result data(Map<String, Object> map){
        this.setData(map);
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
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

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "R{" +
                "success=" + success +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
