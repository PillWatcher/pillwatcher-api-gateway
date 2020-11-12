package br.com.pillwatcher.api.gateway.service;

import br.com.pillwatcher.api.gateway.dto.patient.prescription.PatientPrescriptionDTOForCreate;
import br.com.pillwatcher.api.gateway.dto.patient.prescription.PatientPrescriptionDTOForResponse;
import br.com.pillwatcher.api.gateway.service.common.RestTemplateCommon;
import org.springframework.core.ParameterizedTypeReference;
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
                                                                final String cpf, final String nurseId) {
        return postForObject(pillWatcherGatewayURI.uriPrescriptionCreate(), dtoForCreate,
                new ParameterizedTypeReference<PatientPrescriptionDTOForResponse>() {
                });
    }

    public List<PatientPrescriptionDTOForResponse> getPrescriptions(final String cpf) {
        return getForObject(pillWatcherGatewayURI.uriPrescriptionGetAll(),
                new ParameterizedTypeReference<List<PatientPrescriptionDTOForResponse>>() {
                });
    }

    public PatientPrescriptionDTOForResponse getPrescription(final Long id) {
        return getForObject(pillWatcherGatewayURI.uriPrescriptionGetDeleteOrUpdate(id),
                new ParameterizedTypeReference<PatientPrescriptionDTOForResponse>() {
                });
    }

    public PatientPrescriptionDTOForResponse updatePrescription(final PatientPrescriptionDTOForCreate dtoForCreate,
                                                                final Long id) {
        return updateForObject(pillWatcherGatewayURI.uriPrescriptionGetDeleteOrUpdate(id), dtoForCreate,
                new ParameterizedTypeReference<PatientPrescriptionDTOForResponse>() {
                });
    }

    public void deletePrescription(final Long id) {
        deleteForObject(pillWatcherGatewayURI.uriPrescriptionGetDeleteOrUpdate(id));
    }

}
