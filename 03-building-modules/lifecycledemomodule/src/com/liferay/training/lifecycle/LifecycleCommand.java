package com.liferay.training.lifecycle;

import org.osgi.service.component.annotations.Component;

/**
 * A simple component that provides an OSGi shell command
 * 
 * @author J.R. Omahen
 *
 */
@Component(
		service = Object.class, 
		immediate = false, 
		property = { 
				"osgi.command.function=life",
				"osgi.command.scope=liferay"
				})
public class LifecycleCommand {

	/**
	 * Output a simple response when executed in the shell
	 */
	public void life() {
		System.out.println("[Lifecycle Module] Liferay: Enterprise. Open Source. For Life.");
		System.out.println("[Lifecycle Module] This module is active and running!");
	}
}