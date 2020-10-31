package com.khubla.sadl;

import org.junit.jupiter.api.*;

import com.khubla.gml4j.*;

public class Test1 {
	@Test
	public void test11() {
		try {
			final GMLGraph gmlGraph = new GMLGraph();
			gmlGraph.getRootList().add("comment", "This is a sample graph");
			gmlGraph.getRootList().add("directed", 1);
			gmlGraph.getRootList().add("id", 42);
			gmlGraph.getRootList().add("label", "Hello, I am a graph");
			final GMLListValue node1 = new GMLListValue();
			gmlGraph.getRootList().add(GMLRender.KEY_NODE, node1);
			node1.add("id", 1);
			node1.add("label", "node 1");
			node1.add("thisIsASampleAttribute", 42);
			gmlGraph.render(System.out);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
