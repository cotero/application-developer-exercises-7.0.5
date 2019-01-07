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
 * Provides the local service utility for Assignment. This utility wraps
 * {@link com.liferay.training.space.gradebook.service.impl.AssignmentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AssignmentLocalService
 * @see com.liferay.training.space.gradebook.service.base.AssignmentLocalServiceBaseImpl
 * @see com.liferay.training.space.gradebook.service.impl.AssignmentLocalServiceImpl
 * @generated
 */
@ProviderType
public class AssignmentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.training.space.gradebook.service.impl.AssignmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the assignment to the database. Also notifies the appropriate model listeners.
	*
	* @param assignment the assignment
	* @return the assignment that was added
	*/
	public static com.liferay.training.space.gradebook.model.Assignment addAssignment(
		com.liferay.training.space.gradebook.model.Assignment assignment) {
		return getService().addAssignment(assignment);
	}

	/**
	* addAssignment: Creates a new Assignment using the given data.
	*
	* @param title Map of the locales to the title names.
	* @param description Description of the assignment.
	* @param dueDate The due date for the assignment.
	* @param serviceContext The service context instance.
	* @return Assignment The newly created assignment.
	*/
	public static com.liferay.training.space.gradebook.model.Assignment addAssignment(
		java.util.Map<java.util.Locale, java.lang.String> title,
		java.lang.String description, java.util.Date dueDate,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService()
				   .addAssignment(title, description, dueDate, serviceContext);
	}

	/**
	* Creates a new assignment with the primary key. Does not add the assignment to the database.
	*
	* @param assignmentId the primary key for the new assignment
	* @return the new assignment
	*/
	public static com.liferay.training.space.gradebook.model.Assignment createAssignment(
		long assignmentId) {
		return getService().createAssignment(assignmentId);
	}

	/**
	* Deletes the assignment from the database. Also notifies the appropriate model listeners.
	*
	* @param assignment the assignment
	* @return the assignment that was removed
	*/
	public static com.liferay.training.space.gradebook.model.Assignment deleteAssignment(
		com.liferay.training.space.gradebook.model.Assignment assignment) {
		return getService().deleteAssignment(assignment);
	}

	/**
	* Deletes the assignment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assignmentId the primary key of the assignment
	* @return the assignment that was removed
	* @throws PortalException if a assignment with the primary key could not be found
	*/
	public static com.liferay.training.space.gradebook.model.Assignment deleteAssignment(
		long assignmentId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAssignment(assignmentId);
	}

	public static com.liferay.training.space.gradebook.model.Assignment fetchAssignment(
		long assignmentId) {
		return getService().fetchAssignment(assignmentId);
	}

	/**
	* Returns the assignment matching the UUID and group.
	*
	* @param uuid the assignment's UUID
	* @param groupId the primary key of the group
	* @return the matching assignment, or <code>null</code> if a matching assignment could not be found
	*/
	public static com.liferay.training.space.gradebook.model.Assignment fetchAssignmentByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchAssignmentByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the assignment with the primary key.
	*
	* @param assignmentId the primary key of the assignment
	* @return the assignment
	* @throws PortalException if a assignment with the primary key could not be found
	*/
	public static com.liferay.training.space.gradebook.model.Assignment getAssignment(
		long assignmentId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAssignment(assignmentId);
	}

	/**
	* Returns the assignment matching the UUID and group.
	*
	* @param uuid the assignment's UUID
	* @param groupId the primary key of the group
	* @return the matching assignment
	* @throws PortalException if a matching assignment could not be found
	*/
	public static com.liferay.training.space.gradebook.model.Assignment getAssignmentByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAssignmentByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the assignment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assignment the assignment
	* @return the assignment that was updated
	*/
	public static com.liferay.training.space.gradebook.model.Assignment updateAssignment(
		com.liferay.training.space.gradebook.model.Assignment assignment) {
		return getService().updateAssignment(assignment);
	}

	/**
	* Returns the number of assignments.
	*
	* @return the number of assignments
	*/
	public static int getAssignmentsCount() {
		return getService().getAssignmentsCount();
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

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.training.space.gradebook.model.impl.AssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.training.space.gradebook.model.impl.AssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the assignments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.training.space.gradebook.model.impl.AssignmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assignments
	* @param end the upper bound of the range of assignments (not inclusive)
	* @return the range of assignments
	*/
	public static java.util.List<com.liferay.training.space.gradebook.model.Assignment> getAssignments(
		int start, int end) {
		return getService().getAssignments(start, end);
	}

	public static java.util.List<com.liferay.training.space.gradebook.model.Assignment> getAssignmentsByGroupId(
		long groupId) {
		return getService().getAssignmentsByGroupId(groupId);
	}

	public static java.util.List<com.liferay.training.space.gradebook.model.Assignment> getAssignmentsByGroupId(
		long groupId, int start, int end) {
		return getService().getAssignmentsByGroupId(groupId, start, end);
	}

	/**
	* Returns all the assignments matching the UUID and company.
	*
	* @param uuid the UUID of the assignments
	* @param companyId the primary key of the company
	* @return the matching assignments, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.training.space.gradebook.model.Assignment> getAssignmentsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getAssignmentsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of assignments matching the UUID and company.
	*
	* @param uuid the UUID of the assignments
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of assignments
	* @param end the upper bound of the range of assignments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching assignments, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.training.space.gradebook.model.Assignment> getAssignmentsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.training.space.gradebook.model.Assignment> orderByComparator) {
		return getService()
				   .getAssignmentsByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static AssignmentLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AssignmentLocalService, AssignmentLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AssignmentLocalService.class);
}