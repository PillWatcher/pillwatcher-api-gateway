package br.com.pillwatcher.api.gateway.exception;

import br.com.pillwatcher.api.gateway.utils.ObjectMapperUtil;
import io.micrometer.core.instrument.util.IOUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.springframework.http.HttpStatus.Series.CLIENT_ERROR;
import static org.springframework.http.HttpStatus.Series.SERVER_ERROR;

public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {

  @Override
  public boolean hasError(ClientHttpResponse httpResponse) throws IOException {
    return (httpResponse.getStatusCode().series() == CLIENT_ERROR || httpResponse.getStatusCode().series() == SERVER_ERROR);
  }

  @Override
  public void handleError(ClientHttpResponse httpResponse) throws IOException {

    final HttpStatus statusCode = httpResponse.getStatusCode();

    Fault fault = ObjectMapperUtil.toObject(IOUtils.toString(httpResponse.getBody(), StandardCharsets.UTF_8), Fault.class);
    throw new BaseException(fault.getCode() == null ? "INTERNAL_SERVER_ERROR" : fault.getCode(),
            fault.getMessage(), fault.getDetails() != null ? fault.getDetails().get(0) : "", statusCode);

  }

}
