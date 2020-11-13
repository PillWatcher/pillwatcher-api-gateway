package br.com.pillwatcher.api.gateway.controllers;

import br.com.pillwatcher.api.gateway.dto.medicine.MedicineDTOForAll;
import br.com.pillwatcher.api.gateway.dto.medicine.MedicineDTOForCreate;
import br.com.pillwatcher.api.gateway.dto.medicine.MedicineDTOForResponse;
import br.com.pillwatcher.api.gateway.service.MedicineService;
import br.com.pillwatcher.api.gateway.utils.Constants;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@Api(tags = {"Medicine"})
@RequestMapping(value = Constants.MEDICINE_BASE_PATH, produces = APPLICATION_JSON_VALUE)
public class MedicineController {

  private final MedicineService medicineService;

  @PostMapping
  public ResponseEntity<MedicineDTOForResponse> createMedicine(final @RequestBody @Valid MedicineDTOForCreate body) {
    return ResponseEntity.ok(medicineService.createMedicine(body));
  }

  @DeleteMapping(Constants.MEDICINE_ID_BASE_PATH)
  public ResponseEntity<Void> deleteMedicine(@PathVariable("medicineId") final Long medicineId) {
    medicineService.deleteMedicine(medicineId);
    return ResponseEntity.ok().build();
  }

  @GetMapping
  public ResponseEntity<MedicineDTOForAll> getAllMedicines() {
    return ResponseEntity.ok(medicineService.getAllMedicines());
  }

  @GetMapping(Constants.MEDICINE_ID_BASE_PATH)
  public ResponseEntity<MedicineDTOForResponse> getMedicine(@PathVariable("medicineId") final Long medicineId) {
    return ResponseEntity.ok(medicineService.getMedicine(medicineId));
  }

  @PutMapping(Constants.MEDICINE_ID_BASE_PATH)
  public ResponseEntity<MedicineDTOForResponse> updateMedicine(@RequestBody @Valid MedicineDTOForCreate body,
                                                               @PathVariable("medicineId") Long medicineId) {
    return ResponseEntity.ok(medicineService.updateMedicine(medicineId, body));
  }

}
