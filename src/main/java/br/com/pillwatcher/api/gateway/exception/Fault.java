package br.com.pillwatcher.api.gateway.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fault {

  private String code;
  private String message;
  private List<String> details;

}
