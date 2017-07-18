package com.giffing.bucket4j.spring.boot.starter.context;

import java.util.ArrayList;
import java.util.List;

import com.giffing.bucket4j.spring.boot.starter.RateLimitCheck;

public class FilterConfiguration {

	private List<RateLimitCheck> rateLimitChecks = new ArrayList<>();
	
	private RateLimitConditionMatchingStrategy strategy = RateLimitConditionMatchingStrategy.FIRST;
	
	private String url;
	
	private int order;
	
	private String httpResponseBody;


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public List<RateLimitCheck> getRateLimitChecks() {
		return rateLimitChecks;
	}

	public void setRateLimitChecks(List<RateLimitCheck> rateLimitChecks) {
		this.rateLimitChecks = rateLimitChecks;
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

}
