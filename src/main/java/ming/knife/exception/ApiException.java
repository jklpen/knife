package ming.knife.exception;

/**
 * api调用的异常
 * 
 * @author Ming
 *
 */
public class ApiException extends CustomException {

    private static final long serialVersionUID = -3697515703233382547L;

    public ApiException() {
        super();
    }

    /**
     * @param message
     * @param cause
     */
    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public ApiException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public ApiException(Throwable cause) {
        super(cause);
    }

}
