package br.com.pillwatcher.api.gateway.controllers;

import br.com.pillwatcher.api.gateway.dto.patient.prescription.PatientPrescriptionDTOForCreate;
import br.com.pillwatcher.api.gateway.dto.patient.prescription.PatientPrescriptionDTOForGetAll;
import br.com.pillwatcher.api.gateway.dto.patient.prescription.PatientPrescriptionDTOForResponse;
import br.com.pillwatcher.api.gateway.service.PrescriptionService;
import br.com.pillwatcher.api.gateway.utils.Constants;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@Api(tags = {"Prescription"})
@RequestMapping(value = Constants.PRESCRIPTION_BASE_PATH, produces = APPLICATION_JSON_VALUE)
public class PrescriptionController {

  private final PrescriptionService prescriptionService;

  @PostMapping
  public ResponseEntity<PatientPrescriptionDTOForResponse> createPatientPrescription(@Valid final PatientPrescriptionDTOForCreate body,
                                                                                     @NotNull @Valid final String cpf,
                                                                                     @NotNull @Valid final Long nurseId) {
    return ResponseEntity.ok(prescriptionService.createPrescription(body, cpf, nurseId));
  }

  @GetMapping
  public ResponseEntity<PatientPrescriptionDTOForGetAll> getAllPatientPrescription(@NotNull @Valid final String cpf) {
    return ResponseEntity.ok(prescriptionService.getPrescriptions(cpf));
  }

  @DeleteMapping(Constants.PRESCRIPTION_ID_PATH)
  public ResponseEntity<Void> deletePatientPrescription(@PathVariable("prescriptionId") final Long prescriptionId) {
    prescriptionService.deletePrescription(prescriptionId);
    return ResponseEntity.ok().build();
  }

  @GetMapping(Constants.PRESCRIPTION_ID_PATH)
  public ResponseEntity<PatientPrescriptionDTOForResponse> getPatientPrescription(@PathVariable("prescriptionId") final Long prescriptionId) {
    return ResponseEntity.ok(prescriptionService.getPrescription(prescriptionId));
  }

  @PutMapping(Constants.PRESCRIPTION_ID_PATH)
  public ResponseEntity<PatientPrescriptionDTOForResponse> updatePatientPrescription(@Valid PatientPrescriptionDTOForCreate body, Long prescriptionId) {
    return ResponseEntity.ok(prescriptionService.updatePrescription(body, prescriptionId));
  }

}
