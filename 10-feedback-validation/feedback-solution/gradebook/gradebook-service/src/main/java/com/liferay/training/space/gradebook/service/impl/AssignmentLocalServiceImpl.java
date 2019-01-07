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

package com.liferay.training.space.gradebook.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.space.gradebook.model.Assignment;
import com.liferay.training.space.gradebook.service.base.AssignmentLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The implementation of the assignment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.training.space.gradebook.service.AssignmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @author Dave Nebinger
 * @see AssignmentLocalServiceBaseImpl
 * @see com.liferay.training.space.gradebook.service.AssignmentLocalServiceUtil
 */
@ProviderType
public class AssignmentLocalServiceImpl extends AssignmentLocalServiceBaseImpl {

	/**
	 * addAssignment: Creates a new Assignment using the given data.
	 * @param title Map of the locales to the title names.
	 * @param description Description of the assignment.
	 * @param dueDate The due date for the assignment.
	 * @param serviceContext The service context instance.
	 * @return Assignment The newly created assignment.
	 */
	public Assignment addAssignment(
		final Map<Locale, String> title, final String description,
		final Date dueDate, final ServiceContext serviceContext) {

		// create the assignment id

		long assignmentId = counterLocalService.increment(
			Assignment.class.getName());

		// create a new instance

		Assignment assignment = createAssignment(assignmentId);

		// set the fields from the parameters

		for (Locale locale : title.keySet()) {
			assignment.setTitle(title.get(locale), locale);
		}

		assignment.setDescription(description);
		assignment.setDueDate(dueDate);

		// set the audit fields from the service context

		assignment.setCompanyId(serviceContext.getCompanyId());
		assignment.setGroupId(serviceContext.getScopeGroupId());
		assignment.setUserId(serviceContext.getUserId());

		User user = getUserLocalService().fetchUser(serviceContext.getUserId());

		if (user != null) {
			assignment.setUserName(user.getScreenName());
		}

		assignment.setCreateDate(serviceContext.getCreateDate(new Date()));
		assignment.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		return addAssignment(assignment);
	}

	public List<Assignment> getAssignmentsByGroupId(long groupId) {
		return assignmentPersistence.findByGroupId(groupId);
	}

	public List<Assignment> getAssignmentsByGroupId(
		long groupId, int start, int end) {

		return assignmentPersistence.findByGroupId(groupId, start, end);
	}

	public int getAssignmentsCountByGroupId(long groupId) {
		return assignmentPersistence.countByGroupId(groupId);
	}

}