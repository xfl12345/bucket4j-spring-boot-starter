package com.giffing.bucket4j.spring.boot.starter.context.properties;

import java.util.ArrayList;
import java.util.List;

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
	
	private List<MetricTag> metricTags = new ArrayList<>();
	
	/**
	 * The HTTP content which should be used in case of rate limiting
	 */
	private String httpResponseBody = "{ \"message\": \"Too many requests!\" }";
	
	
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

	public List<MetricTag> getMetricTags() {
		return metricTags;
	}

	public void setMetricTags(List<MetricTag> metricTags) {
		this.metricTags = metricTags;
	}

}