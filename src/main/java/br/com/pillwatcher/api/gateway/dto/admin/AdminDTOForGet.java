package br.com.pillwatcher.api.gateway.dto.admin;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Structure used to create a Admin on Pillwatcher
 */
@ApiModel(description = "Structure used to create a Admin on Pillwatcher")
@Validated
public class AdminDTOForGet {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("document")
    private String document = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("imageUrl")
    private String imageUrl = null;

    public AdminDTOForGet name(String name) {
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

    public AdminDTOForGet document(String document) {
        this.document = document;
        return this;
    }

    /**
     * Admin Official Document (CPF)
     *
     * @return document
     **/
    @ApiModelProperty(example = "12345678910", value = "Admin Official Document (CPF)")

    @Size(min = 11, max = 11)
    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public AdminDTOForGet email(String email) {
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

    public AdminDTOForGet imageUrl(String imageUrl) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdminDTOForGet adminDTOForGet = (AdminDTOForGet) o;
        return Objects.equals(this.name, adminDTOForGet.name) &&
                Objects.equals(this.document, adminDTOForGet.document) &&
                Objects.equals(this.email, adminDTOForGet.email) &&
                Objects.equals(this.imageUrl, adminDTOForGet.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, document, email, imageUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdminDTOForGet {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    document: ").append(toIndentedString(document)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
