/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.space.gradebook.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Assignment. This utility wraps
 * {@link com.liferay.training.space.gradebook.service.impl.AssignmentServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AssignmentService
 * @see com.liferay.training.space.gradebook.service.base.AssignmentServiceBaseImpl
 * @see com.liferay.training.space.gradebook.service.impl.AssignmentServiceImpl
 * @generated
 */
@ProviderType
public class AssignmentServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.training.space.gradebook.service.impl.AssignmentServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.training.space.gradebook.model.Assignment addAssignment(
		java.util.Map<java.util.Locale, java.lang.String> title,
		java.lang.String description, java.util.Date dueDate,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addAssignment(title, description, dueDate, serviceContext);
	}

	public static com.liferay.training.space.gradebook.model.Assignment deleteAssignment(
		com.liferay.training.space.gradebook.model.Assignment assignment)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAssignment(assignment);
	}

	public static com.liferay.training.space.gradebook.model.Assignment deleteAssignment(
		long assignmentId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAssignment(assignmentId);
	}

	public static com.liferay.training.space.gradebook.model.Assignment getAssignment(
		long assignmentId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAssignment(assignmentId);
	}

	public static com.liferay.training.space.gradebook.model.Assignment updateAssignment(
		com.liferay.training.space.gradebook.model.Assignment assignment)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().updateAssignment(assignment);
	}

	public static int getAssignmentsCountByGroupId(long groupId) {
		return getService().getAssignmentsCountByGroupId(groupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.training.space.gradebook.model.Assignment> getAssignmentsByGroupId(
		long groupId) {
		return getService().getAssignmentsByGroupId(groupId);
	}

	public static java.util.List<com.liferay.training.space.gradebook.model.Assignment> getAssignmentsByGroupId(
		long groupId, int start, int end) {
		return getService().getAssignmentsByGroupId(groupId, start, end);
	}

	public static AssignmentService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AssignmentService, AssignmentService> _serviceTracker =
		ServiceTrackerFactory.open(AssignmentService.class);
}