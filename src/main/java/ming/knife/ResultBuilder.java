package ming.knife;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;

import ming.knife.exception.ApiException;
import ming.knife.exception.ConvertException;
import ming.knife.exception.CustomException;
import ming.knife.exception.IllegalRecordException;
import ming.knife.exception.IllegalTypeException;
import ming.knife.exception.NotSupportedException;
import ming.knife.exception.PartException;
import ming.knife.exception.StatusException;
import ming.knife.exception.UnalteredException;

/**
 * 运行结果制造器
 * 
 * @author Ming
 *
 */
public class ResultBuilder {

    private ResultBuilder() {
    }

    public static <T> Result<T> build(int status, String message, T data) {
        return new Result<T>(status, message, data);
    }

    public static <T> Result<T> build(int status, String message) {
        return new Result<T>(status, message);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>(200, "success", data);
    }

    public static <T> Result<T> success() {
        return new Result<T>(200, "ok");
    }

    public static <T> Result<T> error(int status, String message, T data) {
        return new Result<T>(status, message, data);
    }

    public static <T> Result<T> error(int status, String message) {
        return new Result<T>(status, message, null);
    }

    public static <T> Result<T> error(String message) {
        return new Result<T>(-1, message, null);
    }

    public static <T> Result<T> error() {
        return new Result<T>(-1, "系统繁忙");
    }

    public static <T> Result<T> error(Throwable throwable) {
        // 默认异常状态码
        int status = -2;
        if (throwable instanceof CustomException) {
            status = -3; // 自定义的异常
        } else if (throwable instanceof ApiException) {
            status = -4; // api调用的异常
        } else if (throwable instanceof ConvertException) {
            status = -5; // 类型转化的异常
        } else if (throwable instanceof IllegalArgumentException) {
            status = -6; // 参数错误的异常
        } else if (throwable instanceof IllegalRecordException) {
            status = -7; // 操作记录非法的异常
        } else if (throwable instanceof IllegalTypeException) {
            status = -8; // 类型错误的异常
        } else if (throwable instanceof NotSupportedException) {
            status = -9; // 不受支持的异常
        } else if (throwable instanceof PartException) {
            status = -10; // 部分处理失败的异常
        } else if (throwable instanceof StatusException) {
            status = -11; // 状态不符的异常
        } else if (throwable instanceof UnalteredException) {
            status = -12; // 记录没有改变而强制要求更新的异常
        }
        return new Result<T>(status, throwable.getMessage());
    }

    private static <T> String toJsonString(Result<T> result) {
        return JSONObject.toJSONString(result);
    }

    public static <T> String toJsonpString(Result<T> result, String callback) {
        return StringUtils.isEmpty(callback) ? "callback" : callback + "(" + toJsonString(result) + ")";
    }

    public static <T> String toJsonpString(int status, String message, T data, String callback) {
        Result<T> result = ResultBuilder.build(status, message, data);
        return toJsonpString(result, callback);
    }

    public static <T> String toJsonpString(int status, String message, T data) {
        Result<T> result = ResultBuilder.build(status, message, data);
        return toJsonpString(result, null);
    }

}
