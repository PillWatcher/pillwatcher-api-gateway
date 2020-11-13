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
 * Prescrition response of patient on Pillwatcher
 */
@ApiModel(description = "Prescrition response of patient on Pillwatcher")
@Validated
public class PatientPrescriptionDTOForResponse {

    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("imageUrl")
    private String imageUrl = null;

    @JsonProperty("patientCpf")
    private String patientCpf = null;

    @JsonProperty("validityDate")
    private LocalDateTime validityDate = null;

    @JsonProperty("inclusionDate")
    private LocalDateTime inclusionDate = null;

    @JsonProperty("updateDate")
    private LocalDateTime updateDate = null;

    public PatientPrescriptionDTOForResponse id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Id Prescription
     *
     * @return id
     **/
    @ApiModelProperty(example = "2.0", value = "Id Prescription")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PatientPrescriptionDTOForResponse imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Image of prescription
     *
     * @return imageUrl
     **/
    @ApiModelProperty(example = "https://s3-amazon.com.br/random-url-here-1239105-as1091.jpg", value = "Image of prescription")

    @Size(min = 15, max = 255)
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public PatientPrescriptionDTOForResponse patientCpf(String patientCpf) {
        this.patientCpf = patientCpf;
        return this;
    }

    /**
     * Patient CPF
     *
     * @return patientCpf
     **/
    @ApiModelProperty(example = "05389654102", value = "Patient CPF")

    @Size(min = 11, max = 11)
    public String getPatientCpf() {
        return patientCpf;
    }

    public void setPatientCpf(String patientCpf) {
        this.patientCpf = patientCpf;
    }

    public PatientPrescriptionDTOForResponse validityDate(LocalDateTime validityDate) {
        this.validityDate = validityDate;
        return this;
    }

    /**
     * Validity date of prescription
     *
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

    public PatientPrescriptionDTOForResponse inclusionDate(LocalDateTime inclusionDate) {
        this.inclusionDate = inclusionDate;
        return this;
    }

    /**
     * Inclusion date of prescription
     *
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

    public PatientPrescriptionDTOForResponse updateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * Update date of prescription
     *
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
        PatientPrescriptionDTOForResponse patientPrescriptionDTOForResponse = (PatientPrescriptionDTOForResponse) o;
        return Objects.equals(this.id, patientPrescriptionDTOForResponse.id) &&
                Objects.equals(this.imageUrl, patientPrescriptionDTOForResponse.imageUrl) &&
                Objects.equals(this.patientCpf, patientPrescriptionDTOForResponse.patientCpf) &&
                Objects.equals(this.validityDate, patientPrescriptionDTOForResponse.validityDate) &&
                Objects.equals(this.inclusionDate, patientPrescriptionDTOForResponse.inclusionDate) &&
                Objects.equals(this.updateDate, patientPrescriptionDTOForResponse.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imageUrl, patientCpf, validityDate, inclusionDate, updateDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatientPrescriptionDTOForResponse {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    patientCpf: ").append(toIndentedString(patientCpf)).append("\n");
        sb.append("    validityDate: ").append(toIndentedString(validityDate)).append("\n");
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
