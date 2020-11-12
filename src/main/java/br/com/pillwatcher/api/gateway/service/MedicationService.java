package br.com.pillwatcher.api.gateway.service;

import br.com.pillwatcher.api.gateway.dto.prescription.medication.PrescriptionMedicationDTOForAll;
import br.com.pillwatcher.api.gateway.dto.prescription.medication.PrescriptionMedicationDTOForCreate;
import br.com.pillwatcher.api.gateway.dto.prescription.medication.PrescriptionMedicationDTOForResponse;
import br.com.pillwatcher.api.gateway.service.common.HttpParametersBuilder;
import br.com.pillwatcher.api.gateway.service.common.RestTemplateCommon;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class MedicationService extends RestTemplateCommon {

  private final PillWatcherGatewayURI pillWatcherGatewayURI;

  public MedicationService(RestTemplate restTemplate, PillWatcherGatewayURI pillWatcherGatewayURI) {
    super(restTemplate);
    this.pillWatcherGatewayURI = pillWatcherGatewayURI;
  }

  public PrescriptionMedicationDTOForResponse createMedication(final Long prescriptionId,
                                                               final PrescriptionMedicationDTOForCreate body) {
    return postForObject(pillWatcherGatewayURI.uriMedicationCreate(getPrescriptionParameter(prescriptionId.toString())), body,
            new ParameterizedTypeReference<PrescriptionMedicationDTOForResponse>() {
            });
  }

  public PrescriptionMedicationDTOForAll getAllMedication(final Long prescriptionId) {
    return getForObject(pillWatcherGatewayURI.uriMedicationCreate(getPrescriptionParameter(prescriptionId.toString())),
            new ParameterizedTypeReference<PrescriptionMedicationDTOForAll>() {
            });
  }

  private HttpParametersBuilder getPrescriptionParameter(final String prescriptionId) {
    MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
    queryParams.add("prescriptionId", prescriptionId);

    HttpParametersBuilder builder = new HttpParametersBuilder();
    builder.addUrlQueryParameter(queryParams);
    return builder;
  }

  public void deleteMedication(final Long medicationId) {
    deleteForObject(pillWatcherGatewayURI.uriMedication(medicationId));
  }

  public PrescriptionMedicationDTOForResponse getMedication(final Long medicationId) {
    return getForObject(pillWatcherGatewayURI.uriMedication(medicationId),
            new ParameterizedTypeReference<PrescriptionMedicationDTOForResponse>() {
            });
  }

  public PrescriptionMedicationDTOForResponse updateMedication(final Long medicationId,
                                                               final PrescriptionMedicationDTOForCreate body) {
    return updateForObject(pillWatcherGatewayURI.uriMedication(medicationId), body,
            new ParameterizedTypeReference<PrescriptionMedicationDTOForResponse>() {
            });
  }

}
