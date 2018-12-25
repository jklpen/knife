package ming.knife.exception;

/**
 * 类型错误的异常
 * 
 * @author Ming
 *
 */
public class IllegalTypeException extends CustomException {

    private static final long serialVersionUID = 1L;

    public IllegalTypeException() {
        super();
    }

    /**
     * @param message
     * @param cause
     */
    public IllegalTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public IllegalTypeException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public IllegalTypeException(Throwable cause) {
        super(cause);
    }

}
