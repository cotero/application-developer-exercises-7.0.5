package com.liferay.training.deployment.impl;

import java.util.Random;

import org.osgi.service.component.annotations.Component;

import com.liferay.training.deployment.api.DeploymentService;

@Component(
	    immediate = true,
	    property = {
	    },
	    service = DeploymentService.class
	)
public class DeploymentImpl implements DeploymentService {

@Override
	    public int generateNumber() {
	    	Random randomGenerator = new Random();
	    	int randomInt = randomGenerator.nextInt(100);
	    	System.out.println("Generated : " + randomInt);
	    	return randomInt;
	    }
}
