package hu.aradipatrik.appdev.utils;

import java.awt.Component;
import java.awt.Container;

public class ContainerUtils {
	public static void addComponentsToContainer(Container container, Component... components) {
		for (Component element : components) {
			container.add(element);
		}
	}
}
