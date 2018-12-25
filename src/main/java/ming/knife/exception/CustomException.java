package ming.knife.exception;

/**
 * 自定义的异常
 * 
 * @author Ming
 *
 */
public class CustomException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CustomException() {
        super();
    }

    /**
     * @param message
     * @param cause
     */
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public CustomException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public CustomException(Throwable cause) {
        super(cause);
    }

}
