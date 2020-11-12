package br.com.pillwatcher.api.gateway.service;

import br.com.pillwatcher.api.gateway.dto.medicine.MedicineDTOForAll;
import br.com.pillwatcher.api.gateway.dto.medicine.MedicineDTOForCreate;
import br.com.pillwatcher.api.gateway.dto.medicine.MedicineDTOForResponse;
import br.com.pillwatcher.api.gateway.service.common.RestTemplateCommon;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MedicineService extends RestTemplateCommon {

  private final PillWatcherGatewayURI pillWatcherGatewayURI;

  public MedicineService(RestTemplate restTemplate, PillWatcherGatewayURI paymentGatewayURI) {
    super(restTemplate);
    this.pillWatcherGatewayURI = paymentGatewayURI;
  }

  public MedicineDTOForResponse createMedicine(final MedicineDTOForCreate body) {
    return postForObject(pillWatcherGatewayURI.uriMedicineCreate(), body,
            new ParameterizedTypeReference<MedicineDTOForResponse>() {
            });
  }

  public void deleteMedicine(final Long medicineId) {
    deleteForObject(pillWatcherGatewayURI.uriMedicine(medicineId));
  }

  public MedicineDTOForAll getAllMedicines() {
    return getForObject(pillWatcherGatewayURI.uriMedicineCreate(),
            new ParameterizedTypeReference<MedicineDTOForAll>() {
            });
  }

  public MedicineDTOForResponse getMedicine(final Long medicineId) {
    return getForObject(pillWatcherGatewayURI.uriMedicine(medicineId),
            new ParameterizedTypeReference<MedicineDTOForResponse>() {
            });
  }

  public MedicineDTOForResponse updateMedicine(final Long medicineId, final MedicineDTOForCreate body) {
    return updateForObject(pillWatcherGatewayURI.uriMedicine(medicineId), body,
            new ParameterizedTypeReference<MedicineDTOForResponse>() {
            });
  }

}
