package br.com.pillwatcher.api.gateway.controllers;

import br.com.pillwatcher.api.gateway.dto.patient.*;
import br.com.pillwatcher.api.gateway.service.PatientService;
import br.com.pillwatcher.api.gateway.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = Constants.PATIENT_BASE_PATH, produces = APPLICATION_JSON_VALUE)
public class PatientController {

  private final PatientService patientService;

  @PostMapping
  public ResponseEntity<PatientDTOForResponse> createPatient(@Valid @RequestBody final PatientDTOForCreate dtoForCreate,
                                                             @Valid @RequestParam(value = "nurseId") final Long nurseId) {

    return ResponseEntity.ok(patientService.dtoForCreate(nurseId, dtoForCreate));
  }

  @PutMapping(Constants.CPF_PATH)
  public ResponseEntity<PatientDTOForResponse> updatePatient(@Valid final @RequestBody PatientDTOForUpdate dtoForUpdate,
                                                             final @RequestParam(value = "nurseId") Long nurseId,
                                                             final @PathVariable("cpf") String cpf) {

    return ResponseEntity.ok(patientService.updatePatient(nurseId, cpf, dtoForUpdate));
  }

  @GetMapping(Constants.CPF_PATH)
  public ResponseEntity<PatientDTOForResponse> getPatient(final @PathVariable("cpf") String cpf,
                                                          final @RequestParam(value = "nurseId") Long nurseId) {

    return ResponseEntity.ok(patientService.getPatient(nurseId, cpf));
  }

  @GetMapping
  public ResponseEntity<PatientDTOForGet> getAllPatients(final @RequestParam("nurseId") Long nurseId) {
    return ResponseEntity.ok(patientService.getAllPatients(nurseId));
  }

  @DeleteMapping(Constants.CPF_PATH)
  public ResponseEntity<Void> deletePatient(final @PathVariable("cpf") String cpf,
                                            final @RequestParam(name = "nurseId") Long nurseId) {
    patientService.deletePatient(cpf, nurseId);
    return ResponseEntity.ok().build();
  }

  @PostMapping(Constants.PATIENT_NURSE_BASE_PATH)
  public ResponseEntity<Void> relationPatientToNurse(final @PathVariable("cpf") String cpf,
                                                     final @PathVariable("nurseId") Long nurseId) {

    patientService.relationPatientToNurse(cpf, nurseId);
    return ResponseEntity.ok().build();
  }

  @GetMapping(Constants.PATIENT_ID_BASE_PATH)
  public ResponseEntity<PatientDetailsDTOForResponse> getPatientDetails(final @PathVariable("patientId") Long patientId) {
    return ResponseEntity.ok(patientService.getPatientDetails(patientId));
  }

}

