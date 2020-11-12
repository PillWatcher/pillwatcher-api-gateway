package br.com.pillwatcher.api.gateway.utils;

public class Constants {

  private Constants() {
  }

  public static final String BASE_PATH = "/v1/pillwatcher";
  public static final String ADMIN_BASE_PATH = BASE_PATH + "/admins";
  public static final String CPF_PATH = "/{cpf}";
  public static final String NURSE_BASE_PATH = BASE_PATH + "/nurses";
  public static final String MEDICINE_BASE_PATH = BASE_PATH + "/medicines";
  public static final String MEDICINE_ID_BASE_PATH = "/{medicineId}";
  public static final String PATIENT_BASE_PATH = BASE_PATH + "/patients";
  public static final String PATIENT_NURSE_BASE_PATH = "/nurse/{nurseId}";
  public static final String PATIENT_ID_BASE_PATH = "/{patientId}/details";

}
