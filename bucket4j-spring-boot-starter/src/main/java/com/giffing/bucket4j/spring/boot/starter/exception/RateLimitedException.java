package com.giffing.bucket4j.spring.boot.starter.exception;

public class RateLimitedException extends RuntimeException {
    private final long retryAfterNanos;

    public RateLimitedException(long retryAfterNanos){
        super("Request is rate limited.");
        this.retryAfterNanos = retryAfterNanos;
    }

    public long getRetryAfterNanos(){
        return retryAfterNanos;
    }
}
