package br.com.pillwatcher.api.gateway.dto.admin;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Structure used to return a Admin created on Pillwatcher
 */
@ApiModel(description = "Structure used to return a Admin created on Pillwatcher")
@Validated
public class AdminDTOForResponse {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("inclusionDate")
    private LocalDateTime inclusionDate = null;

    public AdminDTOForResponse name(String name) {
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

    public AdminDTOForResponse email(String email) {
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

    public AdminDTOForResponse inclusionDate(LocalDateTime inclusionDate) {
        this.inclusionDate = inclusionDate;
        return this;
    }

    /**
     * Admin creation date
     *
     * @return inclusionDate
     **/
    @ApiModelProperty(example = "2020-01-21T17:32:28Z", value = "Admin creation date")

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
        AdminDTOForResponse adminDTOForResponse = (AdminDTOForResponse) o;
        return Objects.equals(this.name, adminDTOForResponse.name) &&
                Objects.equals(this.email, adminDTOForResponse.email) &&
                Objects.equals(this.inclusionDate, adminDTOForResponse.inclusionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, inclusionDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdminDTOForResponse {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
