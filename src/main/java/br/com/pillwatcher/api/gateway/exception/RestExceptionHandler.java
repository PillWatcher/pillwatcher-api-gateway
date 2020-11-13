package br.com.pillwatcher.api.gateway.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Collections;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(BaseException.class)
  public final ResponseEntity<Object> handleBaseException(final BaseException ex) {
    logger.error(ex.getErrorMessage(), ex);

    Fault exceptionResponse = new Fault(ex.getErrorCodeEnum(),
            ex.getErrorMessage(), Collections.singletonList(ex.getMessage()));

    return ResponseEntity.status(ex.getHttpStatus()).body(exceptionResponse);
  }

}
