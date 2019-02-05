package com.pc.serializers;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonDateSerializer extends JsonSerializer<LocalDateTime> {

	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Override
	public void serialize(LocalDateTime date, JsonGenerator generator, SerializerProvider arg2)
			throws IOException, JsonProcessingException {
		final String dateString = date.format(this.formatter);
		generator.writeString(dateString);
	}

}
