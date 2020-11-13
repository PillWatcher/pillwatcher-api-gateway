package br.com.pillwatcher.api.gateway.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BaseException extends RuntimeException {

  private String errorCodeEnum;
  private String errorMessages;
  private HttpStatus httpStatus;

  public BaseException(
          final String errorCodeEnum,
          final String errorMessages,
          final String message,
          final HttpStatus httpStatus) {

    super(message);
    this.errorCodeEnum = errorCodeEnum;
    this.errorMessages = errorMessages;
    this.httpStatus = httpStatus;
  }

  public String getErrorMessage() {
    return errorMessages;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

}
