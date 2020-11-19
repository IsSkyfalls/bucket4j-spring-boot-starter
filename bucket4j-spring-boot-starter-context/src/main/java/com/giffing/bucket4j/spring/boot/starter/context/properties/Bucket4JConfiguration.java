package com.giffing.bucket4j.spring.boot.starter.context.properties;

import java.util.ArrayList;
import java.util.List;

import com.giffing.bucket4j.spring.boot.starter.context.RateLimitedOperation;
import org.springframework.core.Ordered;

import com.giffing.bucket4j.spring.boot.starter.context.FilterMethod;
import com.giffing.bucket4j.spring.boot.starter.context.RateLimitConditionMatchingStrategy;

public class Bucket4JConfiguration {

	/**
	 * The cache name. Should be provided or an exception is thrown
	 */
	private String cacheName = "buckets";
	
	/**
	 * The default {@link FilterMethod} is {@link FilterMethod#SERVLET}
	 */
	private FilterMethod filterMethod = FilterMethod.SERVLET;
	
	/**
	 * The default strategy is {@link RateLimitConditionMatchingStrategy#FIRST}.
	 */
	private RateLimitConditionMatchingStrategy strategy = RateLimitConditionMatchingStrategy.FIRST;
	
	/**
	 * The URL to which the filter should be registered
	 * 
	 */
	private String url = ".*";
	
	/**
	 * The filter order has a default of the highest precedence reduced by 10
	 */
	private int filterOrder = Ordered.HIGHEST_PRECEDENCE + 10;

	private List<RateLimit> rateLimits = new ArrayList<>();
	
	private Metrics metrics = new Metrics();

	/**
	 * The HTTP response body which should be returned when limiting the rate.
	 */
	private String httpResponseBody = "";

	private int responseCode = 429;

	private RateLimitedOperation operation = RateLimitedOperation.RETURN;

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
	
	public Bucket4JConfiguration() {
	}
	
	public String getCacheName() {
		return cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getFilterOrder() {
		return filterOrder;
	}

	public void setFilterOrder(int filterOrder) {
		this.filterOrder = filterOrder;
	}

	public FilterMethod getFilterMethod() {
		return filterMethod;
	}

	public void setFilterMethod(FilterMethod filterMethod) {
		this.filterMethod = filterMethod;
	}

	public List<RateLimit> getRateLimits() {
		return rateLimits;
	}

	public void setRateLimits(List<RateLimit> rateLimits) {
		this.rateLimits = rateLimits;
	}

	public RateLimitConditionMatchingStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(RateLimitConditionMatchingStrategy strategy) {
		this.strategy = strategy;
	}

	public String getHttpResponseBody() {
		return httpResponseBody;
	}

	public void setHttpResponseBody(String httpResponseBody) {
		this.httpResponseBody = httpResponseBody;
	}

	public Metrics getMetrics() {
		return metrics;
	}

	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}

}