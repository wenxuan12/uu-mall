package com.wenxuan.uumall.result.TimeFormatter;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeSerializer extends JsonSerializer<LocalDateTime> {
    public DateTimeSerializer() {
    }

    public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        String formatValue;
        if (value == null) {
            formatValue = null;
        } else {
            formatValue = value.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        }

        gen.writeString(formatValue);
    }
}
