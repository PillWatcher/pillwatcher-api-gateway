package br.com.pillwatcher.api.gateway.dto;

import br.com.pillwatcher.api.gateway.dto.nurse.NurseDTOForResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WrapperListResponse
 */
@Validated
public class WrapperListResponse {

    @JsonProperty("data")
    @Valid
    private List<NurseDTOForResponse> data = null;

    public WrapperListResponse data(List<NurseDTOForResponse> data) {
        this.data = data;
        return this;
    }

    public WrapperListResponse addDataItem(NurseDTOForResponse dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * List nurse response
     *
     * @return data
     **/
    @ApiModelProperty(value = "List nurse response")
    @Valid
    public List<NurseDTOForResponse> getData() {
        return data;
    }

    public void setData(List<NurseDTOForResponse> data) {
        this.data = data;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WrapperListResponse wrapperListResponse = (WrapperListResponse) o;
        return Objects.equals(this.data, wrapperListResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WrapperListResponse {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
