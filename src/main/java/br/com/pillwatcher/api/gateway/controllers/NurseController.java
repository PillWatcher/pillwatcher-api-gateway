package br.com.pillwatcher.api.gateway.controllers;

import br.com.pillwatcher.api.gateway.dto.WrapperListResponse;
import br.com.pillwatcher.api.gateway.dto.nurse.NurseDTOForCreate;
import br.com.pillwatcher.api.gateway.dto.nurse.NurseDTOForResponse;
import br.com.pillwatcher.api.gateway.dto.nurse.NurseDTOForUpdate;
import br.com.pillwatcher.api.gateway.service.NurseService;
import br.com.pillwatcher.api.gateway.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = Constants.NURSE_BASE_PATH, produces = APPLICATION_JSON_VALUE)
public class NurseController {

  private final NurseService nurseService;

  @PostMapping
  public ResponseEntity<NurseDTOForResponse> createNurse(@Valid @RequestBody final NurseDTOForCreate body) {
    NurseDTOForResponse nurseDTOForResponse = nurseService.createNurse(body);

    return ResponseEntity.ok(nurseDTOForResponse);
  }

  @GetMapping(Constants.CPF_PATH)
  public ResponseEntity<NurseDTOForResponse> getNurse(@PathVariable("cpf") final String cpf) {
    NurseDTOForResponse nurseDTOForResponse = nurseService.getNurse(cpf);

    return ResponseEntity.ok(nurseDTOForResponse);
  }

  @PutMapping(Constants.CPF_PATH)
  public ResponseEntity<NurseDTOForResponse> updateNurse(@RequestBody @Valid final NurseDTOForUpdate body,
                                                         @PathVariable("cpf") final String cpf) {

    NurseDTOForResponse nurseDTOForResponse = nurseService.updateNurse(cpf, body);
    return ResponseEntity.ok(nurseDTOForResponse);

  }

  @DeleteMapping(Constants.CPF_PATH)
  public ResponseEntity<Void> deleteNurse(@PathVariable("cpf") final String cpf) {

    nurseService.deleteNurse(cpf);

    return ResponseEntity.ok().build();
  }

  @GetMapping
  public ResponseEntity<WrapperListResponse> getAllNurse() {

    WrapperListResponse wrapperListResponse = nurseService.getAllNurses();

    return ResponseEntity.ok(wrapperListResponse);
  }

}
