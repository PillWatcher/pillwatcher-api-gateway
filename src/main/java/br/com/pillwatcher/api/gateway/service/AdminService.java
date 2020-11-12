package br.com.pillwatcher.api.gateway.service;

import br.com.pillwatcher.api.gateway.dto.admin.AdminDTOForCreate;
import br.com.pillwatcher.api.gateway.dto.admin.AdminDTOForGet;
import br.com.pillwatcher.api.gateway.dto.admin.AdminDTOForResponse;
import br.com.pillwatcher.api.gateway.dto.admin.AdminDTOForUpdate;
import br.com.pillwatcher.api.gateway.service.common.RestTemplateCommon;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService extends RestTemplateCommon {

  private final PillWatcherGatewayURI paymentGatewayURI;

  public AdminService(final RestTemplate restTemplate,
                      final PillWatcherGatewayURI paymentGatewayURI) {
    super(restTemplate);
    this.paymentGatewayURI = paymentGatewayURI;
  }

  public AdminDTOForResponse createAdmin(final AdminDTOForCreate dtoForCreate) {
    return postForObject(paymentGatewayURI.uriAdminCreate(), dtoForCreate,
            new ParameterizedTypeReference<AdminDTOForResponse>() {
            });
  }

  public AdminDTOForGet getAdmin(final String cpf) {
    return getForObject(paymentGatewayURI.uriAdminCPF(cpf),
            new ParameterizedTypeReference<AdminDTOForGet>() {
            });
  }

  public AdminDTOForResponse putAdmin(final String cpf, final AdminDTOForUpdate dtoForUpdate) {
    return updateForObject(paymentGatewayURI.uriAdminCPF(cpf), dtoForUpdate,
            new ParameterizedTypeReference<AdminDTOForResponse>() {
            });
  }

  public void deleteAdmin(final String cpf) {
    deleteForObject(paymentGatewayURI.uriAdminCPF(cpf));
  }
}
