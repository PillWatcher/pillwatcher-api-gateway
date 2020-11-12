package br.com.pillwatcher.api.gateway.controllers;

import br.com.pillwatcher.api.gateway.dto.supply.SupplyForCreateDTO;
import br.com.pillwatcher.api.gateway.dto.supply.SupplyForResponseDTO;
import br.com.pillwatcher.api.gateway.service.SupplyService;
import br.com.pillwatcher.api.gateway.utils.Constants;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@Api(tags = {"Supply"})
@RequestMapping(value = Constants.SUPPLY_BASE_PATH, produces = APPLICATION_JSON_VALUE)
public class SupplyController {

  private final SupplyService supplyService;

  @PostMapping
  public ResponseEntity<SupplyForResponseDTO> createSupply(@Valid final SupplyForCreateDTO body) {
    return ResponseEntity.ok(supplyService.createSupply(body));
  }

}
