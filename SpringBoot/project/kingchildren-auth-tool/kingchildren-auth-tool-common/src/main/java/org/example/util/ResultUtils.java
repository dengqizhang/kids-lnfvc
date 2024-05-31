package org.example.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.core.serializer.Serializer;
import lombok.*;
import java.io.Serializable;

/**
 * 响应类
 * @param <T>
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ResultUtils<T> implements Serializable {
    /**
     * 响应码
     */
    @Getter
    @Setter
    private Integer code;

    /**
     * 响应信息
     */
    @Getter
    @Setter
    private String message;

    /**
     * 响应数据
     */
    @Getter
    @Setter
    private T data;


    @Getter
    @Setter
    private boolean status;


    private ResultUtils(ResultCode resultCode,T data,boolean status){
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
        this.status=status;
    }

    /**
     * 无数据成功返回
     *
     * @return
     */
    public static  <T>ResultUtils success(){
        return new ResultUtils<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),null,true);
    }
    /**
     * 带数据返回
     */
    public static <T> ResultUtils success(T data){
        return new ResultUtils<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data,true);
    }

    /**
     * 失败
     */
    public static  <T>ResultUtils fail(){
        return new ResultUtils<T>(ResultCode.FAIL.getCode(),ResultCode.FAIL.getMessage(), null,false);
    }
    /**
     * 失败
     */
    public static <T> ResultUtils fail(T data){
        return new ResultUtils<T>(ResultCode.FAIL.getCode(),ResultCode.FAIL.getMessage(), data,false);
    }


    @Override
    public String toString() {
        return "ResultUtils [code=" + code + ", message=" + message + ", data=" + data + "]";
    }
}
