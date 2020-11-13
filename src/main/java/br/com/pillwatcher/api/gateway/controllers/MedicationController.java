package br.com.pillwatcher.api.gateway.controllers;

import br.com.pillwatcher.api.gateway.dto.prescription.medication.PrescriptionMedicationDTOForAll;
import br.com.pillwatcher.api.gateway.dto.prescription.medication.PrescriptionMedicationDTOForCreate;
import br.com.pillwatcher.api.gateway.dto.prescription.medication.PrescriptionMedicationDTOForResponse;
import br.com.pillwatcher.api.gateway.service.MedicationService;
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
@Api(tags = {"Medication"})
@RequestMapping(value = Constants.MEDICATION_BASE_PATH, produces = APPLICATION_JSON_VALUE)
public class MedicationController {

  private final MedicationService medicationService;

  @PostMapping
  public ResponseEntity<PrescriptionMedicationDTOForResponse> createMedication(
          @Valid @RequestBody final PrescriptionMedicationDTOForCreate body, @NotNull @Valid final Long prescriptionId) {
    return ResponseEntity.ok(medicationService.createMedication(prescriptionId, body));
  }

  @GetMapping
  public ResponseEntity<PrescriptionMedicationDTOForAll> getAllMedication(@NotNull @Valid final Long prescriptionId) {
    return ResponseEntity.ok(medicationService.getAllMedication(prescriptionId));
  }

  @DeleteMapping(Constants.MEDICATION_ID_PATH)
  public ResponseEntity<Void> deleteMedication(@PathVariable("medicationId") final Long medicationId) {
    medicationService.deleteMedication(medicationId);
    return ResponseEntity.ok().build();
  }

  @GetMapping(Constants.MEDICATION_ID_PATH)
  public ResponseEntity<PrescriptionMedicationDTOForResponse> getMedication(@PathVariable("medicationId") final Long medicationId) {
    return ResponseEntity.ok(medicationService.getMedication(medicationId));
  }

  @PutMapping(Constants.MEDICATION_ID_PATH)
  public ResponseEntity<PrescriptionMedicationDTOForResponse> updateMedication(
          @Valid @RequestBody final PrescriptionMedicationDTOForCreate body, @PathVariable("medicationId") final Long medicationId) {
    return ResponseEntity.ok(medicationService.updateMedication(medicationId, body));
  }

}
