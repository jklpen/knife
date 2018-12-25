package ming.knife;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * 运行结果
 * 
 * @author Ming
 *
 * @param <T>
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 3790115395244915154L;

    private int status;

    private String message;

    private T data;

    public Result() {
    }

    public Result(int status, String message) {
        this.setStatus(status);
        this.setMessage(message);
    }

    public Result(int status, String message, T data) {
        this.setStatus(status);
        this.setMessage(message);
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public Boolean isSuccess() {
        return 200 == status;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}
