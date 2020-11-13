package br.com.pillwatcher.api.gateway.dto.nurse;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Structure used to return a Nurse created on Pillwatcher
 */
@ApiModel(description = "Structure used to return a Nurse created on Pillwatcher")
@Validated
public class NurseDTOForResponse {

    @JsonProperty("id")
    private BigDecimal id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("document")
    private String document = null;

    @JsonProperty("imageUrl")
    private String imageUrl = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("coren")
    private String coren = null;

    @JsonProperty("federativeUnit")
    private String federativeUnit = null;

    @JsonProperty("phone")
    private String phone = null;

    @JsonProperty("inclusionDate")
    private LocalDateTime inclusionDate = null;

    public NurseDTOForResponse id(BigDecimal id) {
        this.id = id;
        return this;
    }

    /**
     * Nurse id
     *
     * @return id
     **/
    @ApiModelProperty(example = "1245.0", value = "Nurse id")

    @Valid
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public NurseDTOForResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Nurse name
     *
     * @return name
     **/
    @ApiModelProperty(example = "Logan Warden", value = "Nurse name")

    @Size(min = 3, max = 120)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NurseDTOForResponse document(String document) {
        this.document = document;
        return this;
    }

    /**
     * Nurse Official Document (CPF)
     *
     * @return document
     **/
    @ApiModelProperty(example = "12345678910", value = "Nurse Official Document (CPF)")

    @Size(min = 11, max = 11)
    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public NurseDTOForResponse imageUrl(String imageUrl) {
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

    public NurseDTOForResponse email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Nurse Email
     *
     * @return email
     **/
    @ApiModelProperty(example = "logan.warden@email.com", value = "Nurse Email")

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NurseDTOForResponse coren(String coren) {
        this.coren = coren;
        return this;
    }

    /**
     * Nurse Coren
     *
     * @return coren
     **/
    @ApiModelProperty(example = "123456", value = "Nurse Coren")

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public NurseDTOForResponse federativeUnit(String federativeUnit) {
        this.federativeUnit = federativeUnit;
        return this;
    }

    /**
     * FU Coren
     *
     * @return federativeUnit
     **/
    @ApiModelProperty(example = "DF", value = "FU Coren")

    public String getFederativeUnit() {
        return federativeUnit;
    }

    public void setFederativeUnit(String federativeUnit) {
        this.federativeUnit = federativeUnit;
    }

    public NurseDTOForResponse phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Nurse Phone
     *
     * @return phone
     **/
    @ApiModelProperty(example = "992568745", value = "Nurse Phone")

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public NurseDTOForResponse inclusionDate(LocalDateTime inclusionDate) {
        this.inclusionDate = inclusionDate;
        return this;
    }

    /**
     * Nurse creation date
     *
     * @return inclusionDate
     **/
    @ApiModelProperty(example = "2020-01-21T17:32:28Z", value = "Nurse creation date")

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
        NurseDTOForResponse nurseDTOForResponse = (NurseDTOForResponse) o;
        return Objects.equals(this.id, nurseDTOForResponse.id) &&
                Objects.equals(this.name, nurseDTOForResponse.name) &&
                Objects.equals(this.document, nurseDTOForResponse.document) &&
                Objects.equals(this.imageUrl, nurseDTOForResponse.imageUrl) &&
                Objects.equals(this.email, nurseDTOForResponse.email) &&
                Objects.equals(this.coren, nurseDTOForResponse.coren) &&
                Objects.equals(this.federativeUnit, nurseDTOForResponse.federativeUnit) &&
                Objects.equals(this.phone, nurseDTOForResponse.phone) &&
                Objects.equals(this.inclusionDate, nurseDTOForResponse.inclusionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, document, imageUrl, email, coren, federativeUnit, phone, inclusionDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NurseDTOForResponse {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    document: ").append(toIndentedString(document)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    coren: ").append(toIndentedString(coren)).append("\n");
        sb.append("    federativeUnit: ").append(toIndentedString(federativeUnit)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
