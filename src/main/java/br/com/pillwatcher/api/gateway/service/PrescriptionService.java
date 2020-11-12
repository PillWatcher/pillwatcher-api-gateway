package br.com.pillwatcher.api.gateway.service;

import br.com.pillwatcher.api.gateway.dto.patient.prescription.PatientPrescriptionDTOForCreate;
import br.com.pillwatcher.api.gateway.dto.patient.prescription.PatientPrescriptionDTOForGetAll;
import br.com.pillwatcher.api.gateway.dto.patient.prescription.PatientPrescriptionDTOForResponse;
import br.com.pillwatcher.api.gateway.service.common.HttpParametersBuilder;
import br.com.pillwatcher.api.gateway.service.common.RestTemplateCommon;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class PrescriptionService extends RestTemplateCommon {

  private final PillWatcherGatewayURI pillWatcherGatewayURI;

  public PrescriptionService(final RestTemplate restTemplate,
                             final PillWatcherGatewayURI pillWatcherGatewayURI) {
    super(restTemplate);
    this.pillWatcherGatewayURI = pillWatcherGatewayURI;
  }

  public PatientPrescriptionDTOForResponse createPrescription(final PatientPrescriptionDTOForCreate dtoForCreate,
                                                              final String cpf, final Long nurseId) {
    return postForObject(pillWatcherGatewayURI.uriPrescriptionCreate(getNurseAndCpfParameter(nurseId.toString(), cpf)), dtoForCreate,
            new ParameterizedTypeReference<PatientPrescriptionDTOForResponse>() {
            });
  }

  public PatientPrescriptionDTOForGetAll getPrescriptions(final String cpf) {
    return getForObject(pillWatcherGatewayURI.uriPrescriptionGetAll(getCpfParameter(cpf)),
            new ParameterizedTypeReference<PatientPrescriptionDTOForGetAll>() {
            });
  }

  public PatientPrescriptionDTOForResponse getPrescription(final Long id) {
    return getForObject(pillWatcherGatewayURI.uriPrescription(id),
            new ParameterizedTypeReference<PatientPrescriptionDTOForResponse>() {
            });
  }

  public PatientPrescriptionDTOForResponse updatePrescription(final PatientPrescriptionDTOForCreate dtoForCreate,
                                                              final Long id) {
    return updateForObject(pillWatcherGatewayURI.uriPrescription(id), dtoForCreate,
            new ParameterizedTypeReference<PatientPrescriptionDTOForResponse>() {
            });
  }

  public void deletePrescription(final Long id) {
    deleteForObject(pillWatcherGatewayURI.uriPrescription(id));
  }

  private HttpParametersBuilder getNurseAndCpfParameter(final String nurseId, final String cpf) {
    MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
    queryParams.add("nurseId", nurseId);
    queryParams.add("cpf", cpf);

    HttpParametersBuilder builder = new HttpParametersBuilder();
    builder.addUrlQueryParameter(queryParams);
    return builder;
  }

  private HttpParametersBuilder getCpfParameter(final String cpf) {
    MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
    queryParams.add("cpf", cpf);

    HttpParametersBuilder builder = new HttpParametersBuilder();
    builder.addUrlQueryParameter(queryParams);
    return builder;
  }

}
