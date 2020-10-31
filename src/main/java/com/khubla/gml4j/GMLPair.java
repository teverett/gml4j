package com.khubla.gml4j;

import java.io.*;

public class GMLPair extends GMLRender {
	private final String key;
	private final GMLRender value;

	public GMLPair(String key, GMLRender value) {
		super();
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public GMLRender getValue() {
		return value;
	}

	@Override
	public void render(OutputStream outputStream, int indent) throws IOException {
		outputStream.write(buildIndent(indent).getBytes());
		outputStream.write(getKey().getBytes());
		outputStream.write(new String(" ").getBytes());
		getValue().render(outputStream, indent);
		outputStream.write(new String("\n").getBytes());
	}
}
