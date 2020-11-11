package br.com.pillwatcher.api.gateway.dto.prescription.medication;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Structure used to create a medication of prescription on Pillwatcher
 */
@ApiModel(description = "Structure used to create a medication of prescription on Pillwatcher")
@Validated
public class PrescriptionMedicationDTOForCreate {

    @JsonProperty("medicineId")
    private Long medicineId = null;

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

    public PrescriptionMedicationDTOForCreate medicineId(Long medicineId) {
        this.medicineId = medicineId;
        return this;
    }

    /**
     * Id of Medicine
     *
     * @return medicineId
     **/
    @ApiModelProperty(example = "10.0", value = "Id of Medicine")

    public Long getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }

    public PrescriptionMedicationDTOForCreate quantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Quantity of medication
     *
     * @return quantity
     **/
    @ApiModelProperty(example = "2.0", value = "Quantity of medication")

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public PrescriptionMedicationDTOForCreate interval(Long interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Interval in hour of medication
     *
     * @return interval
     **/
    @ApiModelProperty(example = "8.0", value = "Interval in hour of medication")

    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public PrescriptionMedicationDTOForCreate batch(String batch) {
        this.batch = batch;
        return this;
    }

    /**
     * Batch of Medication
     *
     * @return batch
     **/
    @ApiModelProperty(example = "0065560654545451294", value = "Batch of Medication")

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public PrescriptionMedicationDTOForCreate observation(String observation) {
        this.observation = observation;
        return this;
    }

    /**
     * Observation of medication
     *
     * @return observation
     **/
    @ApiModelProperty(example = "Tomar em jejum", value = "Observation of medication")

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public PrescriptionMedicationDTOForCreate startDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Start ate of medication
     *
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

    public PrescriptionMedicationDTOForCreate expirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Expiration of medication
     *
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

    public PrescriptionMedicationDTOForCreate location(Long location) {
        this.location = location;
        return this;
    }

    /**
     * Location of medication in PillWatcher
     *
     * @return location
     **/
    @ApiModelProperty(example = "12.0", value = "Location of medication in PillWatcher")

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    public PrescriptionMedicationDTOForCreate cupTag(String cupTag) {
        this.cupTag = cupTag;
        return this;
    }

    /**
     * Unique tag of cup for medication
     *
     * @return cupTag
     **/
    @ApiModelProperty(example = "456055486512SDA", value = "Unique tag of cup for medication")

    public String getCupTag() {
        return cupTag;
    }

    public void setCupTag(String cupTag) {
        this.cupTag = cupTag;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrescriptionMedicationDTOForCreate prescriptionMedicationDTOForCreate = (PrescriptionMedicationDTOForCreate) o;
        return Objects.equals(this.medicineId, prescriptionMedicationDTOForCreate.medicineId) &&
                Objects.equals(this.quantity, prescriptionMedicationDTOForCreate.quantity) &&
                Objects.equals(this.interval, prescriptionMedicationDTOForCreate.interval) &&
                Objects.equals(this.batch, prescriptionMedicationDTOForCreate.batch) &&
                Objects.equals(this.observation, prescriptionMedicationDTOForCreate.observation) &&
                Objects.equals(this.startDate, prescriptionMedicationDTOForCreate.startDate) &&
                Objects.equals(this.expirationDate, prescriptionMedicationDTOForCreate.expirationDate) &&
                Objects.equals(this.location, prescriptionMedicationDTOForCreate.location) &&
                Objects.equals(this.cupTag, prescriptionMedicationDTOForCreate.cupTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicineId, quantity, interval, batch, observation, startDate, expirationDate, location, cupTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrescriptionMedicationDTOForCreate {\n");

        sb.append("    medicineId: ").append(toIndentedString(medicineId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
        sb.append("    observation: ").append(toIndentedString(observation)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    cupTag: ").append(toIndentedString(cupTag)).append("\n");
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
