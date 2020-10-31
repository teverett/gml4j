package com.khubla.gml4j;

import java.io.*;

/**
 * GML Graph
 * 
 * @author tom
 */
public class GMLGraph extends GMLRender {
	private final GMLPair root;

	public GMLGraph() {
		root = new GMLPair(KEY_GRAPH, new GMLListValue());
	}

	public GMLPair getRoot() {
		return root;
	}

	public GMLListValue getRootList() {
		return (GMLListValue) root.getValue();
	}

	public void render(OutputStream outputStream) throws IOException {
		render(outputStream, 0);
	}

	@Override
	protected void render(OutputStream outputStream, int indent) throws IOException {
		root.render(outputStream, indent);
	}
}
