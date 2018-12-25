package ming.knife.exception;

/**
 * 操作记录非法的异常
 * 
 * @author Ming
 *
 */
public class IllegalRecordException extends CustomException {

    private static final long serialVersionUID = 1L;

    public IllegalRecordException() {
        super();
    }

    /**
     * @param message
     * @param cause
     */
    public IllegalRecordException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public IllegalRecordException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public IllegalRecordException(Throwable cause) {
        super(cause);
    }

}
