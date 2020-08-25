package com.hanz.utils.json;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.module.SimpleSerializers;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class MyModule extends SimpleModule {

	private static final long serialVersionUID = 1L;

	MyModule() {
		super("MyModule");
	}

	@Override
	public void setupModule(SetupContext context) {
		SimpleSerializers serializers = new SimpleSerializers();
		DateSerializer serializer = new DateSerializer(true, DateFormat.getInstance());

		serializers.addSerializer(Date.class, serializer);
		serializers.addSerializer(Time.class, serializer);
		serializers.addSerializer(Timestamp.class, serializer);

		context.addSerializers(serializers);
	}

}
