package ming.knife.exception;

/**
 * 状态不符的异常
 * 
 * @author Ming
 *
 */
public class StatusException extends CustomException {

    private static final long serialVersionUID = 1L;

    public StatusException() {
        super();
    }

    /**
     * @param message
     * @param cause
     */
    public StatusException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public StatusException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public StatusException(Throwable cause) {
        super(cause);
    }

}
