package ming.knife.exception;

/**
 * 类型转化的异常
 * 
 * @author Ming
 *
 */
public class ConvertException extends CustomException {

    private static final long serialVersionUID = -6023730972137167348L;

    public ConvertException() {
        super();
    }

    /**
     * @param message
     * @param cause
     */
    public ConvertException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public ConvertException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public ConvertException(Throwable cause) {
        super(cause);
    }

}
