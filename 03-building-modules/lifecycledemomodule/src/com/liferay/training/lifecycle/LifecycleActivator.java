package com.liferay.training.lifecycle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class LifecycleActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("[Lifecycle Demo Module] This module is starting...");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("[Lifecycle Demo Module] This module is stopping...");
	}

}