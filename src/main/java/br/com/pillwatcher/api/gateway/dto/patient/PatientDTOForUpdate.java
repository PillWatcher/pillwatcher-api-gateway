package br.com.pillwatcher.api.gateway.dto.patient;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Structure used to create a Patient on Pillwatcher
 */
@ApiModel(description = "Structure used to create a Patient on Pillwatcher")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-11T20:45:38.705011700-02:00[America/Sao_Paulo]")
public class PatientDTOForUpdate   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("imageUrl")
  private String imageUrl = null;

  @JsonProperty("bornDate")
  private LocalDateTime bornDate = null;

  @JsonProperty("observation")
  private String observation = null;

  @JsonProperty("idNurse")
  private Long idNurse = null;

  public PatientDTOForUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Patient name
   * @return name
  **/
  @ApiModelProperty(example = "Logan Warden", value = "Patient name")
  
  @Size(min=3,max=120)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PatientDTOForUpdate imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Image Url from S3
   * @return imageUrl
  **/
  @ApiModelProperty(example = "https://s3.com/image_from_user.jpg", value = "Image Url from S3")
  
    public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public PatientDTOForUpdate bornDate(LocalDateTime bornDate) {
    this.bornDate = bornDate;
    return this;
  }

  /**
   * Patient born date
   * @return bornDate
  **/
  @ApiModelProperty(value = "Patient born date")
  
    @Valid
    public LocalDateTime getBornDate() {
    return bornDate;
  }

  public void setBornDate(LocalDateTime bornDate) {
    this.bornDate = bornDate;
  }

  public PatientDTOForUpdate observation(String observation) {
    this.observation = observation;
    return this;
  }

  /**
   * Patient Observation
   * @return observation
  **/
  @ApiModelProperty(example = "O paciente possui pressão alta;", value = "Patient Observation")
  
    public String getObservation() {
    return observation;
  }

  public void setObservation(String observation) {
    this.observation = observation;
  }

  public PatientDTOForUpdate idNurse(Long idNurse) {
    this.idNurse = idNurse;
    return this;
  }

  /**
   * Nurse id
   * @return idNurse
  **/
  @ApiModelProperty(example = "145.0", value = "Nurse id")
  
    public Long getIdNurse() {
    return idNurse;
  }

  public void setIdNurse(Long idNurse) {
    this.idNurse = idNurse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientDTOForUpdate patientDTOForUpdate = (PatientDTOForUpdate) o;
    return Objects.equals(this.name, patientDTOForUpdate.name) &&
        Objects.equals(this.imageUrl, patientDTOForUpdate.imageUrl) &&
        Objects.equals(this.bornDate, patientDTOForUpdate.bornDate) &&
        Objects.equals(this.observation, patientDTOForUpdate.observation) &&
        Objects.equals(this.idNurse, patientDTOForUpdate.idNurse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, imageUrl, bornDate, observation, idNurse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientDTOForUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    bornDate: ").append(toIndentedString(bornDate)).append("\n");
    sb.append("    observation: ").append(toIndentedString(observation)).append("\n");
    sb.append("    idNurse: ").append(toIndentedString(idNurse)).append("\n");
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
