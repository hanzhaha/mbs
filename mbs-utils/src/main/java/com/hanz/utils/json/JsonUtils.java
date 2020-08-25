package com.hanz.utils.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class JsonUtils {

	private static final ObjectMapper MAPPER;

	static {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
		mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);

		mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
		mapper.enable(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES);
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		mapper.disable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL);

		mapper.enable(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS);
		mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		//mapper.enable(SerializationFeature.WRITE_NULL_MAP_VALUES);
		mapper.disable(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);

		mapper.registerModule(new MyModule());

		MAPPER = mapper;
	}

	private JsonUtils() {
		throw new IllegalStateException("Utility class");
	}

	public static <T> T fromJson(String json, Class<T> valueType) throws IOException {
		return MAPPER.readValue(json, valueType);
	}

	public static String toJson(Object obj) throws JsonProcessingException {
		return MAPPER.writeValueAsString(obj);
	}

}
