package br.com.pillwatcher.api.gateway.dto.medication;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Structure used to Stroe Medications Info
 */
@ApiModel(description = "Structure used to Stroe Medications Info")
@Validated
public class MedicationDTO {

    @JsonProperty("medicationId")
    private Long medicationId = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("dosage")
    private Long dosage = null;

    @JsonProperty("dosageType")
    private String dosageType = null;

    @JsonProperty("location")
    private Long location = null;

    @JsonProperty("intervalTime")
    private Long intervalTime = null;

    @JsonProperty("cupTag")
    private String cupTag = null;

    @JsonProperty("availableQuantity")
    private Long availableQuantity = null;

    public MedicationDTO medicationId(Long medicationId) {
        this.medicationId = medicationId;
        return this;
    }

    /**
     * Medication Id
     *
     * @return medicationId
     **/
    @ApiModelProperty(example = "12345.0", value = "Medication Id")

    public Long getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(Long medicationId) {
        this.medicationId = medicationId;
    }

    public MedicationDTO name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Remedy Name
     *
     * @return name
     **/
    @ApiModelProperty(example = "Parecetamol", value = "Remedy Name")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MedicationDTO dosage(Long dosage) {
        this.dosage = dosage;
        return this;
    }

    /**
     * Remedy Dosage
     *
     * @return dosage
     **/
    @ApiModelProperty(example = "25.0", value = "Remedy Dosage")

    public Long getDosage() {
        return dosage;
    }

    public void setDosage(Long dosage) {
        this.dosage = dosage;
    }

    public MedicationDTO dosageType(String dosageType) {
        this.dosageType = dosageType;
        return this;
    }

    /**
     * Remedy Dosage Type
     *
     * @return dosageType
     **/
    @ApiModelProperty(example = "mL", value = "Remedy Dosage Type")

    public String getDosageType() {
        return dosageType;
    }

    public void setDosageType(String dosageType) {
        this.dosageType = dosageType;
    }

    public MedicationDTO location(Long location) {
        this.location = location;
        return this;
    }

    /**
     * Remedy Location on Pillwatcher
     *
     * @return location
     **/
    @ApiModelProperty(example = "17.0", value = "Remedy Location on Pillwatcher")

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    public MedicationDTO intervalTime(Long intervalTime) {
        this.intervalTime = intervalTime;
        return this;
    }

    /**
     * Remedy Application Inteval Time
     *
     * @return intervalTime
     **/
    @ApiModelProperty(example = "30.0", value = "Remedy Application Inteval Time")

    public Long getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Long intervalTime) {
        this.intervalTime = intervalTime;
    }

    public MedicationDTO cupTag(String cupTag) {
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

    public MedicationDTO availableQuantity(Long availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    /**
     * Remedy Quantity Available
     *
     * @return availableQuantity
     **/
    @ApiModelProperty(example = "30.0", value = "Remedy Quantity Available")

    public Long getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Long availableQuantity) {
        this.availableQuantity = availableQuantity;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MedicationDTO medicationDTO = (MedicationDTO) o;
        return Objects.equals(this.medicationId, medicationDTO.medicationId) &&
                Objects.equals(this.name, medicationDTO.name) &&
                Objects.equals(this.dosage, medicationDTO.dosage) &&
                Objects.equals(this.dosageType, medicationDTO.dosageType) &&
                Objects.equals(this.location, medicationDTO.location) &&
                Objects.equals(this.intervalTime, medicationDTO.intervalTime) &&
                Objects.equals(this.cupTag, medicationDTO.cupTag) &&
                Objects.equals(this.availableQuantity, medicationDTO.availableQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicationId, name, dosage, dosageType, location, intervalTime, cupTag, availableQuantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MedicationDTO {\n");

        sb.append("    medicationId: ").append(toIndentedString(medicationId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dosage: ").append(toIndentedString(dosage)).append("\n");
        sb.append("    dosageType: ").append(toIndentedString(dosageType)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    intervalTime: ").append(toIndentedString(intervalTime)).append("\n");
        sb.append("    cupTag: ").append(toIndentedString(cupTag)).append("\n");
        sb.append("    availableQuantity: ").append(toIndentedString(availableQuantity)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
