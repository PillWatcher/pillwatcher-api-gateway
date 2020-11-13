package br.com.pillwatcher.api.gateway.dto.prescription;

import br.com.pillwatcher.api.gateway.dto.medication.MedicationDTOForGet;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Structure used to get Patient&#x27;s Prescription Info
 */
@ApiModel(description = "Structure used to get Patient's Prescription Info")
@Validated
public class PrescriptionToPatientDTO {

    @JsonProperty("prescriptionId")
    private Long prescriptionId = null;

    @JsonProperty("validityDate")
    private LocalDateTime validityDate = null;

    @JsonProperty("medication")
    private MedicationDTOForGet medication = null;

    public PrescriptionToPatientDTO prescriptionId(Long prescriptionId) {
        this.prescriptionId = prescriptionId;
        return this;
    }

    /**
     * Id Prescription
     *
     * @return prescriptionId
     **/
    @ApiModelProperty(example = "12345.0", value = "Id Prescription")

    public Long getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Long prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public PrescriptionToPatientDTO validityDate(LocalDateTime validityDate) {
        this.validityDate = validityDate;
        return this;
    }

    /**
     * Validity Date of Prescription
     *
     * @return validityDate
     **/
    @ApiModelProperty(value = "Validity Date of Prescription")

    @Valid
    public LocalDateTime getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(LocalDateTime validityDate) {
        this.validityDate = validityDate;
    }

    public PrescriptionToPatientDTO medication(MedicationDTOForGet medication) {
        this.medication = medication;
        return this;
    }

    /**
     * Get medication
     *
     * @return medication
     **/
    @ApiModelProperty(value = "")

    @Valid
    public MedicationDTOForGet getMedication() {
        return medication;
    }

    public void setMedication(MedicationDTOForGet medication) {
        this.medication = medication;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrescriptionToPatientDTO prescriptionToPatientDTO = (PrescriptionToPatientDTO) o;
        return Objects.equals(this.prescriptionId, prescriptionToPatientDTO.prescriptionId) &&
                Objects.equals(this.validityDate, prescriptionToPatientDTO.validityDate) &&
                Objects.equals(this.medication, prescriptionToPatientDTO.medication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prescriptionId, validityDate, medication);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrescriptionToPatientDTO {\n");

        sb.append("    prescriptionId: ").append(toIndentedString(prescriptionId)).append("\n");
        sb.append("    validityDate: ").append(toIndentedString(validityDate)).append("\n");
        sb.append("    medication: ").append(toIndentedString(medication)).append("\n");
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
