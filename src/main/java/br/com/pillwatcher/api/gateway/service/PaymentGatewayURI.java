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

  public URI uriAdminCreate() {
    UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(
            adminHost + Constants.ADMIN_BASE_PATH);
    return uriBuilder.build().toUri();
  }

}
