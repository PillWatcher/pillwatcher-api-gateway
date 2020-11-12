package br.com.pillwatcher.api.gateway.service;

import br.com.pillwatcher.api.gateway.utils.Constants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class PaymentGatewayURI {

  @Value("${admin.host}")
  private String adminHost;

  @Value("${nurse.host}")
  private String nurseHost;

  public URI uriAdminCreate() {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            adminHost + Constants.ADMIN_BASE_PATH);
    return uriBuilder.build().toUri();
  }

  public URI uriAdminCPF(final String cpf) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            adminHost + Constants.ADMIN_BASE_PATH + Constants.CPF_PATH);
    return uriBuilder.buildAndExpand(cpf).toUri();
  }

  public URI uriNurseCreate() {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            nurseHost + Constants.NURSE_BASE_PATH);
    return uriBuilder.build().toUri();
  }

  public URI uriNurseCPF(final String cpf) {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            nurseHost + Constants.NURSE_BASE_PATH + Constants.CPF_PATH);
    return uriBuilder.buildAndExpand(cpf).toUri();
  }

}
