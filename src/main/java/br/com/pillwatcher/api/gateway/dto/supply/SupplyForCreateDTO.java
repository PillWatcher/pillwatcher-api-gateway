package br.com.pillwatcher.api.gateway.dto.supply;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Structure used to supply
 */
@ApiModel(description = "Structure used to suplly")
@Validated
public class SupplyForCreateDTO {
    @JsonProperty("medicationId")
    private Long medicationId = null;

    @JsonProperty("nurseId")
    private Long nurseId = null;

    @JsonProperty("quantity")
    private Long quantity = null;

    public SupplyForCreateDTO medicationId(Long medicationId) {
        this.medicationId = medicationId;
        return this;
    }

    /**
     * Id Medication
     *
     * @return medicationId
     **/
    @ApiModelProperty(example = "76.0", value = "Id Medication")

    public Long getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(Long medicationId) {
        this.medicationId = medicationId;
    }

    public SupplyForCreateDTO nurseId(Long nurseId) {
        this.nurseId = nurseId;
        return this;
    }

    /**
     * NurseId
     *
     * @return nurseId
     **/
    @ApiModelProperty(example = "25.0", value = "NurseId")

    public Long getNurseId() {
        return nurseId;
    }

    public void setNurseId(Long nurseId) {
        this.nurseId = nurseId;
    }

    public SupplyForCreateDTO quantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Medication Quantity
     *
     * @return quantity
     **/
    @ApiModelProperty(example = "3.0", value = "Medication Quantity")

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SupplyForCreateDTO supplyForCreateDTO = (SupplyForCreateDTO) o;
        return Objects.equals(this.medicationId, supplyForCreateDTO.medicationId) &&
                Objects.equals(this.nurseId, supplyForCreateDTO.nurseId) &&
                Objects.equals(this.quantity, supplyForCreateDTO.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicationId, nurseId, quantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupplyForCreateDTO {\n");

        sb.append("    medicationId: ").append(toIndentedString(medicationId)).append("\n");
        sb.append("    nurseId: ").append(toIndentedString(nurseId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
