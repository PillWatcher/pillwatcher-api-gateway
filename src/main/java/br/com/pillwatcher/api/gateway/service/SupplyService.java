package br.com.pillwatcher.api.gateway.service;

import br.com.pillwatcher.api.gateway.dto.supply.SupplyForCreateDTO;
import br.com.pillwatcher.api.gateway.dto.supply.SupplyForResponseDTO;
import br.com.pillwatcher.api.gateway.service.common.RestTemplateCommon;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SupplyService extends RestTemplateCommon {

  private final PillWatcherGatewayURI pillWatcherGatewayURI;

  public SupplyService(RestTemplate restTemplate, PillWatcherGatewayURI pillWatcherGatewayURI) {
    super(restTemplate);
    this.pillWatcherGatewayURI = pillWatcherGatewayURI;
  }

  public SupplyForResponseDTO createSupply(final SupplyForCreateDTO body) {
    return postForObject(pillWatcherGatewayURI.uriSupply(), body,
            new ParameterizedTypeReference<SupplyForResponseDTO>() {
            });
  }

}
