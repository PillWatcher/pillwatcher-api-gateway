package br.com.pillwatcher.api.gateway.service;

import br.com.pillwatcher.api.gateway.utils.Constants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class PillWatcherGatewayURI {

  @Value("${admin.host}")
  private String adminHost;

  @Value("${nurse.host}")
  private String nurseHost;

  @Value("${patient.host}")
  private String patientHost;

  public URI uriAdminCreate() {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            adminHost + Constants.ADMIN_BASE_PATH);
    return uriBuilder.build().toUri();
  }

  public URI uriAdminCPF(final String cpf) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            adminHost + Constants.ADMIN_BASE_PATH + Constants.CPF_PATH);
    return uriBuilder.buildAndExpand(cpf).toUri();
  }

  public URI uriNurseCreate() {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            nurseHost + Constants.NURSE_BASE_PATH);
    return uriBuilder.build().toUri();
  }

  public URI uriNurseCPF(final String cpf) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            nurseHost + Constants.NURSE_BASE_PATH + Constants.CPF_PATH);
    return uriBuilder.buildAndExpand(cpf).toUri();
  }

  public URI uriMedicineCreate() {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.MEDICINE_BASE_PATH);
    return uriBuilder.build().toUri();
  }

  public URI uriMedicine(final Long id) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.MEDICINE_BASE_PATH + Constants.MEDICINE_ID_BASE_PATH);
    return uriBuilder.buildAndExpand(id).toUri();
  }

  public URI uriPatientCreate() {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.MEDICINE_BASE_PATH);
    return uriBuilder.build().toUri();
  }

  public URI uriPrescriptionCreate() {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.PRESCRIPTION_BASE_PATH);
    return uriBuilder.build().toUri();
  }

  public URI uriPrescriptionGetAll() {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.PRESCRIPTION_BASE_PATH);
    return uriBuilder.build().toUri();
  }

  public URI uriPrescriptionGetDeleteOrUpdate(final Long id) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.PRESCRIPTION_ID_BASE_PATH);
    return uriBuilder.buildAndExpand(id).toUri();
  }

}
