package ming.knife.exception;

/**
 * 参数错误的异常
 * 
 * @author Ming
 *
 */
public class IllegalArgumentException extends CustomException {

    private static final long serialVersionUID = 1L;

    public IllegalArgumentException() {
        super();
    }

    /**
     * @param message
     * @param cause
     */
    public IllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public IllegalArgumentException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public IllegalArgumentException(Throwable cause) {
        super(cause);
    }

}
