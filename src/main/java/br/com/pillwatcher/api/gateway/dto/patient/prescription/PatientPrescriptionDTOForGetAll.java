package br.com.pillwatcher.api.gateway.dto.patient.prescription;

import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Array of Prescription
 */
@ApiModel(description = "Array of Prescription")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-11T20:45:38.705011700-02:00[America/Sao_Paulo]")
public class PatientPrescriptionDTOForGetAll extends ArrayList<PatientPrescriptionDTOForResponse>  {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientPrescriptionDTOForGetAll {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
