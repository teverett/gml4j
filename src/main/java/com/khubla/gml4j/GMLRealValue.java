package com.khubla.gml4j;

import java.io.*;

public class GMLRealValue extends GMLRender {
	private float value;

	public GMLRealValue(float value) {
		super();
		this.value = value;
	}

	public float getValue() {
		return value;
	}

	@Override
	protected void render(OutputStream outputStream, int indent) throws IOException {
		outputStream.write(Double.toString(value).getBytes());
	}

	public void setValue(float value) {
		this.value = value;
	}
}
