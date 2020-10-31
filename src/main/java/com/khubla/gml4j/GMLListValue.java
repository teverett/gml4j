package com.khubla.gml4j;

import java.io.*;
import java.util.*;

public class GMLListValue extends GMLRender {
	private final List<GMLPair> values = new ArrayList<GMLPair>();

	public void add(String key, float value) {
		add(key, new GMLRealValue(value));
	}

	public void add(String key, GMLRender value) {
		values.add(new GMLPair(key, value));
	}

	public void add(String key, int value) {
		add(key, new GMLIntValue(value));
	}

	public void add(String key, String value) {
		add(key, new GMLStringValue(value));
	}

	@Override
	protected void render(OutputStream outputStream, int indent) throws IOException {
		outputStream.write(new String("[\n").getBytes());
		for (final GMLPair pair : values) {
			pair.render(outputStream, indent + 1);
		}
		outputStream.write(buildIndent(indent).getBytes());
		outputStream.write(new String("]").getBytes());
	}
}
