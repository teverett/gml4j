package com.khubla.gml4j;

import java.io.*;

public abstract class GMLRender {
	private static final int INDENT = 3;
	public static final String KEY_GRAPH = "graph";
	public static final String KEY_NODE = "node";
	public static final String KEY_EDGE = "edge";
	public static final String KEY_ID = "id";
	public static final String KEY_LABEL = "label";
	public static final String KEY_SOURCE = "source";
	public static final String KEY_TARGET = "target";

	protected String buildIndent(int indent) {
		final StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < (indent * INDENT); i++) {
			stringBuilder.append(' ');
		}
		return stringBuilder.toString();
	}

	protected abstract void render(OutputStream outputStream, int indent) throws IOException;
}
