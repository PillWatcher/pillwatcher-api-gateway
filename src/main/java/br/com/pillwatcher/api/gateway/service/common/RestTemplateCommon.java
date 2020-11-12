package br.com.pillwatcher.api.gateway.service.common;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.CollectionUtils;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Objects;

@RequiredArgsConstructor
public class RestTemplateCommon {

  private final RestTemplate restTemplate;

  public <T> T postForObject(URI url, Object body, ParameterizedTypeReference<T> responseType) {
    return restTemplate.exchange(url, HttpMethod.POST, getHttpEntity(body, new HttpHeaders()), responseType)
            .getBody();
  }

  public <T> T getForObject(URI url, ParameterizedTypeReference<T> responseType) {
    return restTemplate.exchange(url, HttpMethod.GET, null, responseType).getBody();
  }

  public void deleteForObject(URI url) {
    restTemplate.exchange(url, HttpMethod.DELETE, null, Void.class);
  }

  public <T> T updateForObject(URI url, Object body, ParameterizedTypeReference<T> responseType) {
    return restTemplate.exchange(url, HttpMethod.PUT, getHttpEntity(body, new HttpHeaders()), responseType).getBody();
  }

  private <T> HttpEntity getHttpEntity(final T body, final HttpHeaders headers) {
    MultiValueMap<String, String> multiValueMap = CollectionUtils.toMultiValueMap(headers);
    return Objects.isNull(body) ? new HttpEntity(multiValueMap) : new HttpEntity(body, multiValueMap);
  }

}

