package com.giffing.bucket4j.spring.boot.starter.context;

/**
 * bad name probably
 */
public enum RateLimitedOperation {
    //Returns a string as response
    RETURN,
    /**
     * Raise RateLimitedException
     * Excepting custom ExceptionHandler
     */
    THROW
}
