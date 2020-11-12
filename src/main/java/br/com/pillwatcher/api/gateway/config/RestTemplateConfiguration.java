package br.com.pillwatcher.api.gateway.config;

import br.com.pillwatcher.api.gateway.exception.RestTemplateResponseErrorHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

  @Bean
  @Primary
  public RestTemplate restTemplate() {
    RestTemplate restTemplate = new RestTemplate(this.getClientHttpRequestFactory());
    restTemplate.setErrorHandler(new RestTemplateResponseErrorHandler());
    return restTemplate;
  }

  private HttpComponentsClientHttpRequestFactory getClientHttpRequestFactory() {
    HttpComponentsClientHttpRequestFactory clientRequestFactory = new HttpComponentsClientHttpRequestFactory();
    clientRequestFactory.setReadTimeout(15000);
    clientRequestFactory.setConnectTimeout(15000);
    clientRequestFactory.setConnectionRequestTimeout(15000);
    return clientRequestFactory;
  }

}
