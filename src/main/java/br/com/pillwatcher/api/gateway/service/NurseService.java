package br.com.pillwatcher.api.gateway.service;

import br.com.pillwatcher.api.gateway.dto.WrapperListResponse;
import br.com.pillwatcher.api.gateway.dto.nurse.NurseDTOForCreate;
import br.com.pillwatcher.api.gateway.dto.nurse.NurseDTOForResponse;
import br.com.pillwatcher.api.gateway.dto.nurse.NurseDTOForUpdate;
import br.com.pillwatcher.api.gateway.service.common.RestTemplateCommon;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NurseService extends RestTemplateCommon {

  private final PillWatcherGatewayURI pillWatcherGatewayURI;

  public NurseService(RestTemplate restTemplate, PillWatcherGatewayURI paymentGatewayURI) {
    super(restTemplate);
    this.pillWatcherGatewayURI = paymentGatewayURI;
  }

  public NurseDTOForResponse createNurse(final NurseDTOForCreate body) {
    return postForObject(pillWatcherGatewayURI.uriNurseCreate(), body,
            new ParameterizedTypeReference<NurseDTOForResponse>() {
            });
  }

  public NurseDTOForResponse getNurse(final String cpf) {
    return getForObject(pillWatcherGatewayURI.uriNurseCPF(cpf),
            new ParameterizedTypeReference<NurseDTOForResponse>() {
            });
  }

  public NurseDTOForResponse updateNurse(final String cpf, final NurseDTOForUpdate body) {
    return updateForObject(pillWatcherGatewayURI.uriNurseCPF(cpf), body,
            new ParameterizedTypeReference<NurseDTOForResponse>() {
            });
  }

  public void deleteNurse(final String cpf) {
    deleteForObject(pillWatcherGatewayURI.uriNurseCPF(cpf));
  }

  public WrapperListResponse getAllNurses() {
    return getForObject(pillWatcherGatewayURI.uriNurseCreate(),
            new ParameterizedTypeReference<WrapperListResponse>() {
            });
  }
}
