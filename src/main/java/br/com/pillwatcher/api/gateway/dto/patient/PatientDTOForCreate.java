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
public class PatientDTOForCreate {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("document")
    private String document = null;

    @JsonProperty("imageUrl")
    private String imageUrl = null;

    @JsonProperty("bornDate")
    private LocalDateTime bornDate = null;

    @JsonProperty("observation")
    private String observation = null;

    public PatientDTOForCreate name(String name) {
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

    public PatientDTOForCreate document(String document) {
        this.document = document;
        return this;
    }

    /**
     * Patient Official Document (CPF)
     *
     * @return document
     **/
    @ApiModelProperty(example = "71005638012", value = "Patient Official Document (CPF)")

    @Size(min = 11, max = 11)
    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public PatientDTOForCreate imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Image Url from S3
     *
     * @return imageUrl
     **/
    @ApiModelProperty(example = "https://s3.com/image_from_user.jpg", value = "Image Url from S3")

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public PatientDTOForCreate bornDate(LocalDateTime bornDate) {
        this.bornDate = bornDate;
        return this;
    }

    /**
     * Patient born date
     *
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

    public PatientDTOForCreate observation(String observation) {
        this.observation = observation;
        return this;
    }

    /**
     * Patient Observation
     *
     * @return observation
     **/
    @ApiModelProperty(example = "O paciente possui pressão alta;", value = "Patient Observation")

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PatientDTOForCreate patientDTOForCreate = (PatientDTOForCreate) o;
        return Objects.equals(this.name, patientDTOForCreate.name) &&
                Objects.equals(this.document, patientDTOForCreate.document) &&
                Objects.equals(this.imageUrl, patientDTOForCreate.imageUrl) &&
                Objects.equals(this.bornDate, patientDTOForCreate.bornDate) &&
                Objects.equals(this.observation, patientDTOForCreate.observation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, document, imageUrl, bornDate, observation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatientDTOForCreate {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    document: ").append(toIndentedString(document)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    bornDate: ").append(toIndentedString(bornDate)).append("\n");
        sb.append("    observation: ").append(toIndentedString(observation)).append("\n");
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
