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

package com.liferay.training.space.gradebook.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import com.liferay.training.space.gradebook.service.AssignmentServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link AssignmentServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssignmentServiceSoap
 * @see HttpPrincipal
 * @see AssignmentServiceUtil
 * @generated
 */
@ProviderType
public class AssignmentServiceHttp {
	public static com.liferay.training.space.gradebook.model.Assignment getAssignment(
		HttpPrincipal httpPrincipal, long assignmentId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AssignmentServiceUtil.class,
					"getAssignment", _getAssignmentParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					assignmentId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.training.space.gradebook.model.Assignment)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.training.space.gradebook.model.Assignment deleteAssignment(
		HttpPrincipal httpPrincipal,
		com.liferay.training.space.gradebook.model.Assignment assignment)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AssignmentServiceUtil.class,
					"deleteAssignment", _deleteAssignmentParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					assignment);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.training.space.gradebook.model.Assignment)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.training.space.gradebook.model.Assignment deleteAssignment(
		HttpPrincipal httpPrincipal, long assignmentId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AssignmentServiceUtil.class,
					"deleteAssignment", _deleteAssignmentParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					assignmentId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.training.space.gradebook.model.Assignment)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.training.space.gradebook.model.Assignment addAssignment(
		HttpPrincipal httpPrincipal,
		java.util.Map<java.util.Locale, java.lang.String> title,
		java.lang.String description, java.util.Date dueDate,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AssignmentServiceUtil.class,
					"addAssignment", _addAssignmentParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, title,
					description, dueDate, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.training.space.gradebook.model.Assignment)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.training.space.gradebook.model.Assignment updateAssignment(
		HttpPrincipal httpPrincipal,
		com.liferay.training.space.gradebook.model.Assignment assignment)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AssignmentServiceUtil.class,
					"updateAssignment", _updateAssignmentParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					assignment);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.training.space.gradebook.model.Assignment)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.training.space.gradebook.model.Assignment> getAssignmentsByGroupId(
		HttpPrincipal httpPrincipal, long groupId) {
		try {
			MethodKey methodKey = new MethodKey(AssignmentServiceUtil.class,
					"getAssignmentsByGroupId",
					_getAssignmentsByGroupIdParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.training.space.gradebook.model.Assignment>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.training.space.gradebook.model.Assignment> getAssignmentsByGroupId(
		HttpPrincipal httpPrincipal, long groupId, int start, int end) {
		try {
			MethodKey methodKey = new MethodKey(AssignmentServiceUtil.class,
					"getAssignmentsByGroupId",
					_getAssignmentsByGroupIdParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					start, end);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.training.space.gradebook.model.Assignment>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getAssignmentsCountByGroupId(
		HttpPrincipal httpPrincipal, long groupId) {
		try {
			MethodKey methodKey = new MethodKey(AssignmentServiceUtil.class,
					"getAssignmentsCountByGroupId",
					_getAssignmentsCountByGroupIdParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AssignmentServiceHttp.class);
	private static final Class<?>[] _getAssignmentParameterTypes0 = new Class[] {
			long.class
		};
	private static final Class<?>[] _deleteAssignmentParameterTypes1 = new Class[] {
			com.liferay.training.space.gradebook.model.Assignment.class
		};
	private static final Class<?>[] _deleteAssignmentParameterTypes2 = new Class[] {
			long.class
		};
	private static final Class<?>[] _addAssignmentParameterTypes3 = new Class[] {
			java.util.Map.class, java.lang.String.class, java.util.Date.class,
			com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _updateAssignmentParameterTypes4 = new Class[] {
			com.liferay.training.space.gradebook.model.Assignment.class
		};
	private static final Class<?>[] _getAssignmentsByGroupIdParameterTypes5 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getAssignmentsByGroupIdParameterTypes6 = new Class[] {
			long.class, int.class, int.class
		};
	private static final Class<?>[] _getAssignmentsCountByGroupIdParameterTypes7 =
		new Class[] { long.class };
}