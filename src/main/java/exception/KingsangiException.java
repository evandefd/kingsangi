package exception;

public class KingsangiException extends RuntimeException {
    public KingsangiException() {
    }

    public KingsangiException(String message) {
        super(message);
    }

    public KingsangiException(String message, Throwable cause) {
        super(message, cause);
    }

    public KingsangiException(Throwable cause) {
        super(cause);
    }

    public KingsangiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
