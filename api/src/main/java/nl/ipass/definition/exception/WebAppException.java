package nl.ipass.definition.exception;

public class WebAppException extends RuntimeException {

    public WebAppException(String errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }
}
