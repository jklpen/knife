package ming.knife.exception;

/**
 * 不受支持的异常
 * 
 * @author Ming
 *
 */
public class NotSupportedException extends CustomException {

    private static final long serialVersionUID = 1L;

    public NotSupportedException() {
        super();
    }

    /**
     * @param message
     * @param cause
     */
    public NotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public NotSupportedException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public NotSupportedException(Throwable cause) {
        super(cause);
    }

}
