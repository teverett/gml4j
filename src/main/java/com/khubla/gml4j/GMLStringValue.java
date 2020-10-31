package com.khubla.gml4j;

import java.io.*;

public class GMLStringValue extends GMLRender {
	private final String value;

	public GMLStringValue(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	protected void render(OutputStream outputStream, int indent) throws IOException {
		outputStream.write(new String("\"" + value + "\"").getBytes());
	}
}
