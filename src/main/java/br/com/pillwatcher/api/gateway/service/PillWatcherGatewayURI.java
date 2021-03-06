package br.com.pillwatcher.api.gateway.service;

import br.com.pillwatcher.api.gateway.service.common.HttpParametersBuilder;
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

  public URI uriPatientCreate(final HttpParametersBuilder builder) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.PATIENT_BASE_PATH);
    uriBuilder.queryParams(builder.getQueryParameters());
    return uriBuilder.build().toUri();
  }

  public URI uriPatientCPF(final HttpParametersBuilder builder, final String cpf) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.PATIENT_BASE_PATH + Constants.CPF_PATH);
    uriBuilder.queryParams(builder.getQueryParameters());
    return uriBuilder.buildAndExpand(cpf).toUri();
  }

  public URI uriPatientNurse(final Long nurseId, final String cpf) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.PATIENT_BASE_PATH + Constants.PATIENT_NURSE_BASE_PATH);
    return uriBuilder.buildAndExpand(cpf, nurseId).toUri();
  }

  public URI uriPatientId(final Long patientId) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.PATIENT_BASE_PATH + Constants.PATIENT_ID_BASE_PATH);
    return uriBuilder.buildAndExpand(patientId).toUri();
  }

  public URI uriMedicationCreate(final HttpParametersBuilder builder) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.MEDICATION_BASE_PATH);
    uriBuilder.queryParams(builder.getQueryParameters());
    return uriBuilder.build().toUri();
  }

  public URI uriMedication(final Long medicationId) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.MEDICATION_BASE_PATH + Constants.MEDICATION_ID_PATH);
    return uriBuilder.buildAndExpand(medicationId).toUri();
  }

  public URI uriSupply() {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.SUPPLY_BASE_PATH);
    return uriBuilder.build().toUri();
  }

  public URI uriPrescriptionCreate(HttpParametersBuilder builder) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.PRESCRIPTION_BASE_PATH);
    uriBuilder.queryParams(builder.getQueryParameters());
    return uriBuilder.build().toUri();
  }

  public URI uriPrescriptionGetAll(HttpParametersBuilder builder) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.PRESCRIPTION_BASE_PATH);
    uriBuilder.queryParams(builder.getQueryParameters());
    return uriBuilder.build().toUri();
  }

  public URI uriPrescription(final Long id) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            patientHost + Constants.PRESCRIPTION_BASE_PATH + Constants.PRESCRIPTION_ID_PATH);
    return uriBuilder.buildAndExpand(id).toUri();
  }

}
