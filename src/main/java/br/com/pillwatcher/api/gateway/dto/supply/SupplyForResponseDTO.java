package br.com.pillwatcher.api.gateway.dto.supply;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Structure used to suplly
 */
@ApiModel(description = "Structure used to suplly")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-11T20:45:38.705011700-02:00[America/Sao_Paulo]")
public class SupplyForResponseDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("medicationId")
  private Long medicationId = null;

  @JsonProperty("nurseId")
  private Long nurseId = null;

  @JsonProperty("quantity")
  private Long quantity = null;

  @JsonProperty("inclusionDate")
  private LocalDateTime inclusionDate = null;

  public SupplyForResponseDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Id Sypply
   * @return id
  **/
  @ApiModelProperty(example = "1.0", value = "Id Sypply")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SupplyForResponseDTO medicationId(Long medicationId) {
    this.medicationId = medicationId;
    return this;
  }

  /**
   * Id Medication
   * @return medicationId
  **/
  @ApiModelProperty(example = "76.0", value = "Id Medication")
  
    public Long getMedicationId() {
    return medicationId;
  }

  public void setMedicationId(Long medicationId) {
    this.medicationId = medicationId;
  }

  public SupplyForResponseDTO nurseId(Long nurseId) {
    this.nurseId = nurseId;
    return this;
  }

  /**
   * NurseId
   * @return nurseId
  **/
  @ApiModelProperty(example = "25.0", value = "NurseId")
  
    public Long getNurseId() {
    return nurseId;
  }

  public void setNurseId(Long nurseId) {
    this.nurseId = nurseId;
  }

  public SupplyForResponseDTO quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Medication Quantity
   * @return quantity
  **/
  @ApiModelProperty(example = "3.0", value = "Medication Quantity")
  
    public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public SupplyForResponseDTO inclusionDate(LocalDateTime inclusionDate) {
    this.inclusionDate = inclusionDate;
    return this;
  }

  /**
   * Inclusion date of prescription
   * @return inclusionDate
  **/
  @ApiModelProperty(example = "2020-01-21T23:23:23Z", value = "Inclusion date of prescription")
  
    @Valid
    public LocalDateTime getInclusionDate() {
    return inclusionDate;
  }

  public void setInclusionDate(LocalDateTime inclusionDate) {
    this.inclusionDate = inclusionDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplyForResponseDTO supplyForResponseDTO = (SupplyForResponseDTO) o;
    return Objects.equals(this.id, supplyForResponseDTO.id) &&
        Objects.equals(this.medicationId, supplyForResponseDTO.medicationId) &&
        Objects.equals(this.nurseId, supplyForResponseDTO.nurseId) &&
        Objects.equals(this.quantity, supplyForResponseDTO.quantity) &&
        Objects.equals(this.inclusionDate, supplyForResponseDTO.inclusionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, medicationId, nurseId, quantity, inclusionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplyForResponseDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    medicationId: ").append(toIndentedString(medicationId)).append("\n");
    sb.append("    nurseId: ").append(toIndentedString(nurseId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    inclusionDate: ").append(toIndentedString(inclusionDate)).append("\n");
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
