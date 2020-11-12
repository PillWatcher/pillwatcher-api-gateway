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
  public static final String PATIENT_NURSE_BASE_PATH = CPF_PATH + "/nurse/{nurseId}";
  public static final String PATIENT_ID_BASE_PATH = "/{patientId}/details";
  public static final String MEDICATION_BASE_PATH = BASE_PATH + "/medications";
  public static final String MEDICATION_ID_PATH = "/{medicationId}";
  public static final String SUPPLY_BASE_PATH = BASE_PATH + "/supplies";
  public static final String PRESCRIPTION_BASE_PATH = BASE_PATH + "/prescriptions";
  public static final String PRESCRIPTION_ID_PATH = "/{prescriptionId}";

}
