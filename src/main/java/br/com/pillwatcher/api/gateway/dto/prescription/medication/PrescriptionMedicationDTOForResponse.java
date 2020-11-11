package br.com.pillwatcher.api.gateway.dto.prescription.medication;

import br.com.pillwatcher.api.gateway.dto.medicine.MedicineDTOForResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Structure used to found a medication of prescription on Pillwatcher
 */
@ApiModel(description = "Structure used to found a medication of prescription on Pillwatcher")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-11T20:45:38.705011700-02:00[America/Sao_Paulo]")
public class PrescriptionMedicationDTOForResponse   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("prescriptionId")
  private Long prescriptionId = null;

  @JsonProperty("medicine")
  private MedicineDTOForResponse medicine = null;

  @JsonProperty("quantity")
  private Long quantity = null;

  @JsonProperty("interval")
  private Long interval = null;

  @JsonProperty("batch")
  private String batch = null;

  @JsonProperty("observation")
  private String observation = null;

  @JsonProperty("startDate")
  private LocalDateTime startDate = null;

  @JsonProperty("expirationDate")
  private LocalDateTime expirationDate = null;

  @JsonProperty("location")
  private Long location = null;

  @JsonProperty("cupTag")
  private String cupTag = null;

  @JsonProperty("availableQuantity")
  private Long availableQuantity = null;

  @JsonProperty("inclusionDate")
  private LocalDateTime inclusionDate = null;

  @JsonProperty("updateDate")
  private LocalDateTime updateDate = null;

  public PrescriptionMedicationDTOForResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Id Medication
   * @return id
  **/
  @ApiModelProperty(example = "2.0", value = "Id Medication")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PrescriptionMedicationDTOForResponse prescriptionId(Long prescriptionId) {
    this.prescriptionId = prescriptionId;
    return this;
  }

  /**
   * Id prescription
   * @return prescriptionId
  **/
  @ApiModelProperty(example = "89.0", value = "Id prescription")
  
    public Long getPrescriptionId() {
    return prescriptionId;
  }

  public void setPrescriptionId(Long prescriptionId) {
    this.prescriptionId = prescriptionId;
  }

  public PrescriptionMedicationDTOForResponse medicine(MedicineDTOForResponse medicine) {
    this.medicine = medicine;
    return this;
  }

  /**
   * Get medicine
   * @return medicine
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MedicineDTOForResponse getMedicine() {
    return medicine;
  }

  public void setMedicine(MedicineDTOForResponse medicine) {
    this.medicine = medicine;
  }

  public PrescriptionMedicationDTOForResponse quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of medication
   * @return quantity
  **/
  @ApiModelProperty(example = "2.0", value = "Quantity of medication")
  
    public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public PrescriptionMedicationDTOForResponse interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Interval in hour of medication
   * @return interval
  **/
  @ApiModelProperty(example = "8.0", value = "Interval in hour of medication")
  
    public Long getInterval() {
    return interval;
  }

  public void setInterval(Long interval) {
    this.interval = interval;
  }

  public PrescriptionMedicationDTOForResponse batch(String batch) {
    this.batch = batch;
    return this;
  }

  /**
   * Batch of Medication
   * @return batch
  **/
  @ApiModelProperty(example = "0065560654545451294", value = "Batch of Medication")
  
    public String getBatch() {
    return batch;
  }

  public void setBatch(String batch) {
    this.batch = batch;
  }

  public PrescriptionMedicationDTOForResponse observation(String observation) {
    this.observation = observation;
    return this;
  }

  /**
   * Observation of medication
   * @return observation
  **/
  @ApiModelProperty(example = "Tomar em jejum", value = "Observation of medication")
  
    public String getObservation() {
    return observation;
  }

  public void setObservation(String observation) {
    this.observation = observation;
  }

  public PrescriptionMedicationDTOForResponse startDate(LocalDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start ate of medication
   * @return startDate
  **/
  @ApiModelProperty(value = "Start ate of medication")
  
    @Valid
    public LocalDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  public PrescriptionMedicationDTOForResponse expirationDate(LocalDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Expiration of medication
   * @return expirationDate
  **/
  @ApiModelProperty(value = "Expiration of medication")
  
    @Valid
    public LocalDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public PrescriptionMedicationDTOForResponse location(Long location) {
    this.location = location;
    return this;
  }

  /**
   * Location of medication in PillWatcher
   * @return location
  **/
  @ApiModelProperty(example = "12.0", value = "Location of medication in PillWatcher")
  
    public Long getLocation() {
    return location;
  }

  public void setLocation(Long location) {
    this.location = location;
  }

  public PrescriptionMedicationDTOForResponse cupTag(String cupTag) {
    this.cupTag = cupTag;
    return this;
  }

  /**
   * Unique tag of cup for medication
   * @return cupTag
  **/
  @ApiModelProperty(example = "456055486512SDA", value = "Unique tag of cup for medication")
  
    public String getCupTag() {
    return cupTag;
  }

  public void setCupTag(String cupTag) {
    this.cupTag = cupTag;
  }

  public PrescriptionMedicationDTOForResponse availableQuantity(Long availableQuantity) {
    this.availableQuantity = availableQuantity;
    return this;
  }

  /**
   * Available quantity of medication in PillWatcher
   * @return availableQuantity
  **/
  @ApiModelProperty(example = "25.0", value = "Available quantity of medication in PillWatcher")
  
    public Long getAvailableQuantity() {
    return availableQuantity;
  }

  public void setAvailableQuantity(Long availableQuantity) {
    this.availableQuantity = availableQuantity;
  }

  public PrescriptionMedicationDTOForResponse inclusionDate(LocalDateTime inclusionDate) {
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

  public PrescriptionMedicationDTOForResponse updateDate(LocalDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Update date of prescription
   * @return updateDate
  **/
  @ApiModelProperty(value = "Update date of prescription")
  
    @Valid
    public LocalDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(LocalDateTime updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrescriptionMedicationDTOForResponse prescriptionMedicationDTOForResponse = (PrescriptionMedicationDTOForResponse) o;
    return Objects.equals(this.id, prescriptionMedicationDTOForResponse.id) &&
        Objects.equals(this.prescriptionId, prescriptionMedicationDTOForResponse.prescriptionId) &&
        Objects.equals(this.medicine, prescriptionMedicationDTOForResponse.medicine) &&
        Objects.equals(this.quantity, prescriptionMedicationDTOForResponse.quantity) &&
        Objects.equals(this.interval, prescriptionMedicationDTOForResponse.interval) &&
        Objects.equals(this.batch, prescriptionMedicationDTOForResponse.batch) &&
        Objects.equals(this.observation, prescriptionMedicationDTOForResponse.observation) &&
        Objects.equals(this.startDate, prescriptionMedicationDTOForResponse.startDate) &&
        Objects.equals(this.expirationDate, prescriptionMedicationDTOForResponse.expirationDate) &&
        Objects.equals(this.location, prescriptionMedicationDTOForResponse.location) &&
        Objects.equals(this.cupTag, prescriptionMedicationDTOForResponse.cupTag) &&
        Objects.equals(this.availableQuantity, prescriptionMedicationDTOForResponse.availableQuantity) &&
        Objects.equals(this.inclusionDate, prescriptionMedicationDTOForResponse.inclusionDate) &&
        Objects.equals(this.updateDate, prescriptionMedicationDTOForResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, prescriptionId, medicine, quantity, interval, batch, observation, startDate, expirationDate, location, cupTag, availableQuantity, inclusionDate, updateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrescriptionMedicationDTOForResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    prescriptionId: ").append(toIndentedString(prescriptionId)).append("\n");
    sb.append("    medicine: ").append(toIndentedString(medicine)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    observation: ").append(toIndentedString(observation)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    cupTag: ").append(toIndentedString(cupTag)).append("\n");
    sb.append("    availableQuantity: ").append(toIndentedString(availableQuantity)).append("\n");
    sb.append("    inclusionDate: ").append(toIndentedString(inclusionDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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
