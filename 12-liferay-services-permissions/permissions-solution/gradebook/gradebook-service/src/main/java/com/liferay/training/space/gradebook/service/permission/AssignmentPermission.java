package com.liferay.training.space.gradebook.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.AuthException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.training.space.gradebook.model.Assignment;

import org.osgi.service.component.annotations.Component;
@Component(
	immediate = true,
	property = {"model.class.name=com.liferay.training.space.gradebook.model.Assignment"}
)
public class AssignmentPermission implements BaseModelPermissionChecker {

	public static final String ADD_ASSIGNMENT = "ADD_ASSIGNMENT";

	public static void check(
			PermissionChecker permissionChecker, long groupId,
			long assignmentId, String actionId)
		throws AuthException {

		if (!contains(permissionChecker, groupId, assignmentId, actionId)) {
			throw new AuthException();
		}
	}

	public static void checkTopLevel(
			PermissionChecker permissionChecker, long groupId, String actionId)
		throws AuthException {

		if (!containsTopLevel(permissionChecker, groupId, actionId)) {
			throw new AuthException();
		}
	}

	public static boolean contains(
		PermissionChecker permissionChecker, long groupId, long assignmentId,
		String actionId) {

		return (permissionChecker.hasPermission(
			groupId, RESOURCE_NAME, assignmentId, actionId));
	}

	public static boolean containsTopLevel(
		PermissionChecker permissionChecker, long groupId, String actionId) {

		return (permissionChecker.hasPermission(
			groupId, TOP_LEVEL_RESOURCE, groupId, actionId));
	}

	@Override
	public void checkBaseModel(
			PermissionChecker permissionChecker, long groupId, long primaryKey,
			String actionId)
		throws PortalException {

		check(permissionChecker, groupId, primaryKey, actionId);
	}

	private static final String RESOURCE_NAME = Assignment.class.getName();

	private static final String TOP_LEVEL_RESOURCE =
		"com.liferay.training.space.gradebook.model";

}