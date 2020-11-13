package br.com.pillwatcher.api.gateway.dto.nurse;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Structure used to create a Nurse on Pillwatcher
 */
@ApiModel(description = "Structure used to create a Nurse on Pillwatcher")
@Validated
public class NurseDTOForUpdate {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("imageUrl")
    private String imageUrl = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("phone")
    private String phone = null;

    public NurseDTOForUpdate name(String name) {
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

    public NurseDTOForUpdate imageUrl(String imageUrl) {
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

    public NurseDTOForUpdate email(String email) {
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

    public NurseDTOForUpdate phone(String phone) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NurseDTOForUpdate nurseDTOForUpdate = (NurseDTOForUpdate) o;
        return Objects.equals(this.name, nurseDTOForUpdate.name) &&
                Objects.equals(this.imageUrl, nurseDTOForUpdate.imageUrl) &&
                Objects.equals(this.email, nurseDTOForUpdate.email) &&
                Objects.equals(this.phone, nurseDTOForUpdate.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, imageUrl, email, phone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NurseDTOForUpdate {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
