package br.com.pillwatcher.api.gateway.service;

import br.com.pillwatcher.api.gateway.dto.patient.*;
import br.com.pillwatcher.api.gateway.service.common.HttpParametersBuilder;
import br.com.pillwatcher.api.gateway.service.common.RestTemplateCommon;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class PatientService extends RestTemplateCommon {

  private final PillWatcherGatewayURI pillWatcherGatewayURI;

  public PatientService(RestTemplate restTemplate, PillWatcherGatewayURI pillWatcherGatewayURI) {
    super(restTemplate);
    this.pillWatcherGatewayURI = pillWatcherGatewayURI;
  }

  public PatientDTOForResponse dtoForCreate(final Long nurseId, final PatientDTOForCreate dtoForCreate) {
    return postForObject(pillWatcherGatewayURI.uriPatientCreate(getNurseParameter(nurseId.toString())), dtoForCreate,
            new ParameterizedTypeReference<PatientDTOForResponse>() {
            });
  }

  public PatientDTOForResponse updatePatient(final Long nurseId, final String cpf,
                                             final PatientDTOForUpdate dtoForUpdate) {
    return updateForObject(pillWatcherGatewayURI.uriPatientCPF(getNurseParameter(nurseId.toString()), cpf), dtoForUpdate,
            new ParameterizedTypeReference<PatientDTOForResponse>() {
            });
  }

  public PatientDTOForResponse getPatient(final Long nurseId, final String cpf) {
    return getForObject(pillWatcherGatewayURI.uriPatientCPF(getNurseParameter(nurseId.toString()), cpf),
            new ParameterizedTypeReference<PatientDTOForResponse>() {
            });
  }

  public PatientDTOForGet getAllPatients(final Long nurseId) {
    return getForObject(pillWatcherGatewayURI.uriPatientCreate(getNurseParameter(nurseId.toString())),
            new ParameterizedTypeReference<PatientDTOForGet>() {
            });
  }

  public void deletePatient(final String cpf, final Long nurseId) {
    deleteForObject(pillWatcherGatewayURI.uriPatientCPF(getNurseParameter(nurseId.toString()), cpf));
  }

  public void relationPatientToNurse(final String cpf, final Long nurseId) {
    postForObject(pillWatcherGatewayURI.uriPatientNurse(nurseId, cpf), null,
            new ParameterizedTypeReference<Void>() {
            });
  }

  private HttpParametersBuilder getNurseParameter(final String nurseId) {
    MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
    queryParams.add("nurseId", nurseId);

    HttpParametersBuilder builder = new HttpParametersBuilder();
    builder.addUrlQueryParameter(queryParams);
    return builder;
  }

  public PatientDetailsDTOForResponse getPatientDetails(final Long patientId) {
    return getForObject(pillWatcherGatewayURI.uriPatientId(patientId),
            new ParameterizedTypeReference<PatientDetailsDTOForResponse>() {
            });
  }
}
