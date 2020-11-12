package br.com.pillwatcher.api.gateway.service;

import br.com.pillwatcher.api.gateway.dto.admin.AdminDTOForCreate;
import br.com.pillwatcher.api.gateway.dto.admin.AdminDTOForResponse;
import br.com.pillwatcher.api.gateway.service.common.RestTemplateCommon;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService extends RestTemplateCommon {

  private final PaymentGatewayURI paymentGatewayURI;

  public AdminService(final RestTemplate restTemplate,
                      final PaymentGatewayURI paymentGatewayURI) {
    super(restTemplate);
    this.paymentGatewayURI = paymentGatewayURI;
  }

  public AdminDTOForResponse createAdmin(final AdminDTOForCreate dtoForCreate) {
    return postForObject(paymentGatewayURI.uriAdminCreate(), dtoForCreate,
            new ParameterizedTypeReference<AdminDTOForResponse>() {
            });
  }

}
