package br.com.pillwatcher.api.gateway.controllers;

import br.com.pillwatcher.api.gateway.dto.admin.AdminDTOForCreate;
import br.com.pillwatcher.api.gateway.dto.admin.AdminDTOForGet;
import br.com.pillwatcher.api.gateway.dto.admin.AdminDTOForResponse;
import br.com.pillwatcher.api.gateway.dto.admin.AdminDTOForUpdate;
import br.com.pillwatcher.api.gateway.service.AdminService;
import br.com.pillwatcher.api.gateway.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static br.com.pillwatcher.api.gateway.utils.Constants.CPF_PATH;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = Constants.ADMIN_BASE_PATH, produces = APPLICATION_JSON_VALUE)
public class AdminController {

  private final AdminService adminService;

  @PostMapping
  public ResponseEntity<AdminDTOForResponse> createAdmin(@Valid @RequestBody final AdminDTOForCreate dtoForCreate) {

    AdminDTOForResponse adminDTOForResponse = adminService.createAdmin(dtoForCreate);

    return ResponseEntity.ok(adminDTOForResponse);
  }

  @GetMapping(CPF_PATH)
  public ResponseEntity<AdminDTOForGet> findAdmin(@PathVariable("cpf") final String cpf) {

    AdminDTOForGet adminDTOForResponse = adminService.getAdmin(cpf);

    return ResponseEntity.ok(adminDTOForResponse);
  }

  @PutMapping(CPF_PATH)
  public ResponseEntity<AdminDTOForResponse> updateAdmin(@Valid @RequestBody final AdminDTOForUpdate dtoForUpdate,
                                                         @PathVariable("cpf") final String cpf) {

    AdminDTOForResponse adminDTOForResponse = adminService.putAdmin(cpf, dtoForUpdate);

    return ResponseEntity.ok(adminDTOForResponse);

  }

  @DeleteMapping(CPF_PATH)
  public ResponseEntity<Void> deleteAdmin(@PathVariable("cpf") final String cpf) {

    adminService.deleteAdmin(cpf);

    return ResponseEntity.ok().build();
  }

}
