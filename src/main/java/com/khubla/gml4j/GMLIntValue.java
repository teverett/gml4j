package com.khubla.gml4j;

import java.io.*;

public class GMLIntValue extends GMLRender {
	private final int value;

	public GMLIntValue(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	protected void render(OutputStream outputStream, int indent) throws IOException {
		outputStream.write(Integer.toString(value).getBytes());
	}
}
