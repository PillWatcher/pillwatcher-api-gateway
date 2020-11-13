package br.com.pillwatcher.api.gateway.dto.medicine;

import br.com.pillwatcher.api.gateway.dto.DosageTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * Structure used to found a medicine Pillwatcher
 */
@ApiModel(description = "Structure used to found a medicine Pillwatcher")
@Validated
public class MedicineDTOForCreate {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("dosage")
    private Long dosage = null;

    @JsonProperty("dosageType")
    private DosageTypeEnum dosageType = null;

    public MedicineDTOForCreate name(String name) {
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

    public MedicineDTOForCreate dosage(Long dosage) {
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

    public MedicineDTOForCreate dosageType(DosageTypeEnum dosageType) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MedicineDTOForCreate medicineDTOForCreate = (MedicineDTOForCreate) o;
        return Objects.equals(this.name, medicineDTOForCreate.name) &&
                Objects.equals(this.dosage, medicineDTOForCreate.dosage) &&
                Objects.equals(this.dosageType, medicineDTOForCreate.dosageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dosage, dosageType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MedicineDTOForCreate {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dosage: ").append(toIndentedString(dosage)).append("\n");
        sb.append("    dosageType: ").append(toIndentedString(dosageType)).append("\n");
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
