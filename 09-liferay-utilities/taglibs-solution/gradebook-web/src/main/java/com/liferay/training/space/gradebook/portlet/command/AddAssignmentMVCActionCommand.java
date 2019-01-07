package com.liferay.training.space.gradebook.portlet.command;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.ServiceContextUtil;
import com.liferay.training.space.gradebook.model.Assignment;
import com.liferay.training.space.gradebook.portlet.GradebookPortletKeys;
import com.liferay.training.space.gradebook.portlet.GradebookPortletUtil;
import com.liferay.training.space.gradebook.service.AssignmentLocalService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + GradebookPortletKeys.PORTLET_NAME,
		"mvc.command.name=/gradebook/assignment/add"
},
	service = MVCActionCommand.class)
public class AddAssignmentMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
		ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {

		// create a new service context instance
		ServiceContext serviceContext =
			ServiceContextFactory.getInstance(actionRequest);

		// Extract the parameter values from the request
		Map<Locale, String> title =
			GradebookPortletUtil.extractTitleMap(actionRequest);
		String description =
			GradebookPortletUtil.extractDescription(actionRequest);
		Date dueDate = GradebookPortletUtil.extractDueDate(actionRequest);

		// use the assignment local service to add the assignment
		Assignment assignment =
			_assignmentLocalService.addAssignment(
				title, description, dueDate, serviceContext);

		sendRedirect(actionRequest, actionResponse);
	}

	@Reference(cardinality = ReferenceCardinality.MANDATORY)
	protected void setAssignmentLocalService(
		final AssignmentLocalService assignmentLocalService) {
		_assignmentLocalService = assignmentLocalService;
	}

	private AssignmentLocalService _assignmentLocalService;
}