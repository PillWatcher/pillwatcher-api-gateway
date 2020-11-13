package br.com.pillwatcher.api.gateway.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DosageTypeEnum
 */
public enum DosageTypeEnum {

    MG("MG"),
    ML("ML");

    private String value;

    DosageTypeEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static DosageTypeEnum fromValue(String text) {
        for (DosageTypeEnum b : DosageTypeEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
