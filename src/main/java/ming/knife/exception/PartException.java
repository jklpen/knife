package ming.knife.exception;

/**
 * 部分处理失败的异常
 * 
 * @author Ming
 *
 */
public class PartException extends CustomException {

    private static final long serialVersionUID = 1L;

    public PartException() {
        super();
    }

    /**
     * @param message
     * @param cause
     */
    public PartException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public PartException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public PartException(Throwable cause) {
        super(cause);
    }

}
