package br.com.pillwatcher.api.gateway.dto.admin;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Structure used to update Admin info on Pillwatcher
 */
@ApiModel(description = "Structure used to update Admin info on Pillwatcher")
@Validated
public class AdminDTOForUpdate {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("imageUrl")
    private String imageUrl = null;

    @JsonProperty("email")
    private String email = null;

    public AdminDTOForUpdate name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Admin name
     *
     * @return name
     **/
    @ApiModelProperty(example = "Logan Warden", value = "Admin name")

    @Size(min = 3, max = 120)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdminDTOForUpdate imageUrl(String imageUrl) {
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

    public AdminDTOForUpdate email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Admin Email
     *
     * @return email
     **/
    @ApiModelProperty(example = "logan.warden@email.com", value = "Admin Email")

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdminDTOForUpdate adminDTOForUpdate = (AdminDTOForUpdate) o;
        return Objects.equals(this.name, adminDTOForUpdate.name) &&
                Objects.equals(this.imageUrl, adminDTOForUpdate.imageUrl) &&
                Objects.equals(this.email, adminDTOForUpdate.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, imageUrl, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdminDTOForUpdate {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
