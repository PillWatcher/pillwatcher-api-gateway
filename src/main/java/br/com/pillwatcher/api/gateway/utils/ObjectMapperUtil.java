package br.com.pillwatcher.api.gateway.utils;

import br.com.pillwatcher.api.gateway.exception.BaseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.util.TimeZone;

public abstract class ObjectMapperUtil {

  public static final ObjectMapper MAPPER = getMapper();

  private ObjectMapperUtil() {
  }

  public static <T> T toObject(final String json, Class<T> clazz) {
    try {
      if (json == null || json.isEmpty()) {
        return clazz.newInstance();
      }
      return MAPPER.readValue(json, clazz);
    } catch (IOException | InstantiationException | IllegalAccessException e) {
      throw new BaseException("PARSING_ERROR", "To Object Error",
              "Error converting json to object", HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  private static ObjectMapper getMapper() {

    ObjectMapper mapper = new ObjectMapper();
    mapper.registerModule(new JavaTimeModule());
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    mapper.setTimeZone(TimeZone.getDefault());

    return mapper;
  }

}
