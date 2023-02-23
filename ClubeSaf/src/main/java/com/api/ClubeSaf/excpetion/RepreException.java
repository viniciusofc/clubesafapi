package com.api.ClubeSaf.excpetion;

public class RepreException extends RuntimeException {
    
    public RepreException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepreException(String message) {
        super(message);
    }

}
