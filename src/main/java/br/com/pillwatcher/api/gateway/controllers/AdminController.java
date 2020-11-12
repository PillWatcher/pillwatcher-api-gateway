package br.com.pillwatcher.api.gateway.controllers;

import br.com.pillwatcher.api.gateway.dto.admin.AdminDTOForCreate;
import br.com.pillwatcher.api.gateway.dto.admin.AdminDTOForResponse;
import br.com.pillwatcher.api.gateway.service.AdminService;
import br.com.pillwatcher.api.gateway.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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

}
