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

  private final PillWatcherGatewayURI pillWatcherGatewayURI;

  public AdminService(final RestTemplate restTemplate,
                      final PillWatcherGatewayURI pillWatcherGatewayURI) {
    super(restTemplate);
    this.pillWatcherGatewayURI = pillWatcherGatewayURI;
  }

  public AdminDTOForResponse createAdmin(final AdminDTOForCreate dtoForCreate) {
    return postForObject(pillWatcherGatewayURI.uriAdminCreate(), dtoForCreate,
            new ParameterizedTypeReference<AdminDTOForResponse>() {
            });
  }

  public AdminDTOForGet getAdmin(final String cpf) {
    return getForObject(pillWatcherGatewayURI.uriAdminCPF(cpf),
            new ParameterizedTypeReference<AdminDTOForGet>() {
            });
  }

  public AdminDTOForResponse putAdmin(final String cpf, final AdminDTOForUpdate dtoForUpdate) {
    return updateForObject(pillWatcherGatewayURI.uriAdminCPF(cpf), dtoForUpdate,
            new ParameterizedTypeReference<AdminDTOForResponse>() {
            });
  }

  public void deleteAdmin(final String cpf) {
    deleteForObject(pillWatcherGatewayURI.uriAdminCPF(cpf));
  }
}
