package com.Dryft.exceptions;

/**
 * Exception for user related things
 * <p>
 * This class provides an enum of error codes that must be given in the
 * constructor. These codes specify the exact cause for the exception.
 * </p>
 */
public class UserSideException extends RuntimeException {

    private final ErrorCode code;

    public UserSideException(ErrorCode code) {
        super();
        this.code = code;
    }

    public UserSideException(String errorMessage, ErrorCode code) {
        super(errorMessage);
        this.code = code;
    }

    public UserSideException(String errorMessage, Throwable err, ErrorCode code) {
        super(errorMessage, err);
        this.code = code;
    }

    public ErrorCode getErrorCode() {
        return this.code;
    }

    /**
     * This enum is the codes for the errors
     * <p>
     * <ul>
     * <li>UsernameAlreadyInUse</li>
     * <li>UsernameNotFound</li>
     * <li>IncorrectPassword</li>
     * <li>BalanceNotEnough</li>
     * </ul>
     * </p>
     */
    public enum ErrorCode {
        EmailAlreadyExists,
        UserNotFound,
        InvalidCredentials,
        BalanceNotEnough
    }
}
