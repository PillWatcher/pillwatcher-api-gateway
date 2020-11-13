package br.com.pillwatcher.api.gateway.dto.patient.prescription;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Structure used to create a prescrition of patient on Pillwatcher
 */
@ApiModel(description = "Structure used to create a prescrition of patient on Pillwatcher")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-11T20:45:38.705011700-02:00[America/Sao_Paulo]")
public class PatientPrescriptionDTOForCreate   {
  @JsonProperty("imageUrl")
  private String imageUrl = null;

  @JsonProperty("validityDate")
  private LocalDateTime validityDate = null;

  public PatientPrescriptionDTOForCreate imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Image of prescription
   * @return imageUrl
  **/
  @ApiModelProperty(example = "https://s3-amazon.com.br/4545645546454546545", value = "Image of prescription")
  
  @Size(min=15,max=255)   public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public PatientPrescriptionDTOForCreate validityDate(LocalDateTime validityDate) {
    this.validityDate = validityDate;
    return this;
  }

  /**
   * Validity date of prescription
   * @return validityDate
  **/
  @ApiModelProperty(value = "Validity date of prescription")
  
    @Valid
    public LocalDateTime getValidityDate() {
    return validityDate;
  }

  public void setValidityDate(LocalDateTime validityDate) {
    this.validityDate = validityDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientPrescriptionDTOForCreate patientPrescriptionDTOForCreate = (PatientPrescriptionDTOForCreate) o;
    return Objects.equals(this.imageUrl, patientPrescriptionDTOForCreate.imageUrl) &&
        Objects.equals(this.validityDate, patientPrescriptionDTOForCreate.validityDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, validityDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientPrescriptionDTOForCreate {\n");
    
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    validityDate: ").append(toIndentedString(validityDate)).append("\n");
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
