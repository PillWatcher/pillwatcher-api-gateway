package br.com.pillwatcher.api.gateway.service.common;

import br.com.pillwatcher.api.gateway.service.PillWatcherGatewayURI;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PatientService extends RestTemplateCommon {

  private final PillWatcherGatewayURI pillWatcherGatewayURI;

  public PatientService(RestTemplate restTemplate, PillWatcherGatewayURI pillWatcherGatewayURI) {
    super(restTemplate);
    this.pillWatcherGatewayURI = pillWatcherGatewayURI;
  }

}
