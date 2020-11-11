package br.com.pillwatcher.api.gateway.dto.medicine;

import br.com.pillwatcher.api.gateway.dto.DosageTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Structure used to create a medicine on Pillwatcher
 */
@ApiModel(description = "Structure used to create a medicine on Pillwatcher")
@Validated
public class MedicineDTOForResponse {

    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("dosage")
    private Long dosage = null;

    @JsonProperty("dosageType")
    private DosageTypeEnum dosageType = null;

    @JsonProperty("inclusionDate")
    private LocalDateTime inclusionDate = null;

    public MedicineDTOForResponse id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Id Medicine
     *
     * @return id
     **/
    @ApiModelProperty(example = "2.0", value = "Id Medicine")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MedicineDTOForResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Medicine name
     *
     * @return name
     **/
    @ApiModelProperty(example = "Novalgina", value = "Medicine name")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MedicineDTOForResponse dosage(Long dosage) {
        this.dosage = dosage;
        return this;
    }

    /**
     * Medicine dosage
     *
     * @return dosage
     **/
    @ApiModelProperty(example = "5.0", value = "Medicine dosage")

    public Long getDosage() {
        return dosage;
    }

    public void setDosage(Long dosage) {
        this.dosage = dosage;
    }

    public MedicineDTOForResponse dosageType(DosageTypeEnum dosageType) {
        this.dosageType = dosageType;
        return this;
    }

    /**
     * Get dosageType
     *
     * @return dosageType
     **/
    @ApiModelProperty(value = "")

    @Valid
    public DosageTypeEnum getDosageType() {
        return dosageType;
    }

    public void setDosageType(DosageTypeEnum dosageType) {
        this.dosageType = dosageType;
    }

    public MedicineDTOForResponse inclusionDate(LocalDateTime inclusionDate) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MedicineDTOForResponse medicineDTOForResponse = (MedicineDTOForResponse) o;
        return Objects.equals(this.id, medicineDTOForResponse.id) &&
                Objects.equals(this.name, medicineDTOForResponse.name) &&
                Objects.equals(this.dosage, medicineDTOForResponse.dosage) &&
                Objects.equals(this.dosageType, medicineDTOForResponse.dosageType) &&
                Objects.equals(this.inclusionDate, medicineDTOForResponse.inclusionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dosage, dosageType, inclusionDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MedicineDTOForResponse {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dosage: ").append(toIndentedString(dosage)).append("\n");
        sb.append("    dosageType: ").append(toIndentedString(dosageType)).append("\n");
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
