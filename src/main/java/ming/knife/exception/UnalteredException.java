package ming.knife.exception;

/**
 * 记录没有改变而强制要求更新的异常
 * 
 * @author Ming
 *
 */
public class UnalteredException extends CustomException {

    private static final long serialVersionUID = 1L;

    public UnalteredException() {
        super();
    }

    /**
     * @param message
     * @param cause
     */
    public UnalteredException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public UnalteredException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public UnalteredException(Throwable cause) {
        super(cause);
    }

}
