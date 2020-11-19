package com.giffing.bucket4j.spring.boot.starter.context.properties;

import java.util.ArrayList;
import java.util.List;

import com.giffing.bucket4j.spring.boot.starter.context.RateLimitCheck;
import com.giffing.bucket4j.spring.boot.starter.context.RateLimitConditionMatchingStrategy;
import com.giffing.bucket4j.spring.boot.starter.context.RateLimitedOperation;

/**
 * This class is the main configuration class which is used to build the Servlet Filter or ZuulFilter.
 */
public class FilterConfiguration<R> {

    private RateLimitConditionMatchingStrategy strategy = RateLimitConditionMatchingStrategy.FIRST;

    /**
     * The url on which the filter should listen.
     */
    private String url;

    /**
     * The order of the filter depending on other filters independently from the Bucket4j filters.
     */
    private int order;

    /**
     * The HTTP response body which should be returned when limiting the rate.
     */
    private String httpResponseBody = "";

	public int getResponseCode(){
		return responseCode;
	}

	public void setResponseCode(int responseCode){
		this.responseCode = responseCode;
	}

	public RateLimitedOperation getOperation(){
		return operation;
	}

	public void setOperation(RateLimitedOperation operation){
		this.operation = operation;
	}

	private int responseCode = 429;

    private RateLimitedOperation operation = RateLimitedOperation.RETURN;

    private List<RateLimitCheck<R>> rateLimitChecks = new ArrayList<>();

    private Metrics metrics;

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public int getOrder(){
        return order;
    }

    public void setOrder(int order){
        this.order = order;
    }

    public List<RateLimitCheck<R>> getRateLimitChecks(){
        return rateLimitChecks;
    }

    public void setRateLimitChecks(List<RateLimitCheck<R>> rateLimitChecks){
        this.rateLimitChecks = rateLimitChecks;
    }

    public RateLimitConditionMatchingStrategy getStrategy(){
        return strategy;
    }

    public void setStrategy(RateLimitConditionMatchingStrategy strategy){
        this.strategy = strategy;
    }

    public String getHttpResponseBody(){
        return httpResponseBody;
    }

    public void setHttpResponseBody(String httpResponseBody){
        this.httpResponseBody = httpResponseBody;
    }

    public Metrics getMetrics(){
        return metrics;
    }

    public void setMetrics(Metrics metrics){
        this.metrics = metrics;
    }

}
