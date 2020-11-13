package br.com.pillwatcher.api.gateway.dto.prescription;

import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Structure used to get Patient&#x27;s Prescription Info
 */
@ApiModel(description = "Structure used to get Patient's Prescription Info")
@Validated
public class PrescriptiontoPatientDTOForGet extends ArrayList<PrescriptionToPatientDTO> {

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrescriptiontoPatientDTOForGet {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
