/*
 * CABAL BRASIL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * Copyright (c) 2020, Cabal Brasil and/or its affiliates. All rights reserved.
 */
package br.com.pillwatcher.api.gateway.service.common;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import static java.util.Objects.nonNull;

public class HttpParametersBuilder {
	
	private MultiValueMap<String, String> queryParameters;
	
	public MultiValueMap<String, String> getQueryParameters() {
		return queryParameters;
	}
	
	public HttpParametersBuilder() {
		this.queryParameters = new LinkedMultiValueMap();
	}
	
	public HttpParametersBuilder addUrlQueryParameter(final MultiValueMap<String, String> queryParameters) {
		
		if (isValidEntry(queryParameters)) {
			this.queryParameters.addAll(queryParameters);
		}
		
		return this;
	}
	
	private boolean isValidEntry(final Object object) {
		return nonNull(object);
	}
}