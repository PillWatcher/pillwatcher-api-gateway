package br.com.pillwatcher.api.gateway.dto.patient;

import br.com.pillwatcher.api.gateway.dto.prescription.PrescriptiontoPatientDTOForGet;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Structure used to create a Patient on Pillwatcher
 */
@ApiModel(description = "Structure used to create a Patient on Pillwatcher")
@Validated
public class PatientDetailsDTOForResponse {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("prescription")
    private PrescriptiontoPatientDTOForGet prescription = null;

    public PatientDetailsDTOForResponse id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Patient id
     *
     * @return id
     **/
    @ApiModelProperty(example = "12345.0", value = "Patient id")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PatientDetailsDTOForResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Patient name
     *
     * @return name
     **/
    @ApiModelProperty(example = "Logan Warden", value = "Patient name")

    @Size(min = 3, max = 120)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PatientDetailsDTOForResponse prescription(PrescriptiontoPatientDTOForGet prescription) {
        this.prescription = prescription;
        return this;
    }

    /**
     * Get prescription
     *
     * @return prescription
     **/
    @ApiModelProperty(value = "")

    @Valid
    public PrescriptiontoPatientDTOForGet getPrescription() {
        return prescription;
    }

    public void setPrescription(PrescriptiontoPatientDTOForGet prescription) {
        this.prescription = prescription;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PatientDetailsDTOForResponse patientDetailsDTOForResponse = (PatientDetailsDTOForResponse) o;
        return Objects.equals(this.id, patientDetailsDTOForResponse.id) &&
                Objects.equals(this.name, patientDetailsDTOForResponse.name) &&
                Objects.equals(this.prescription, patientDetailsDTOForResponse.prescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, prescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatientDetailsDTOForResponse {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    prescription: ").append(toIndentedString(prescription)).append("\n");
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
