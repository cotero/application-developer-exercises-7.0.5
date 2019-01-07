package com.liferay.training.lifecycle.command;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class DemoActivator implements BundleActivator {

@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("[Lifecycle Demo Module] This module is starting...");
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		System.out.println("[Lifecycle Demo Module] This module is stopping...");

	}

}
