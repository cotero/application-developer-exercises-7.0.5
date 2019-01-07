package com.liferay.training.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

@Component (
		immediate = true,
		property = {
				"javax.portlet.name=com_liferay_training_portlet_TrainingComponentPortlet",
				"mvc.command.name=/training/change"
		},
		service = MVCActionCommand.class
		)
public class TrainingComponentMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		actionResponse.setRenderParameter("newText", "Congratulations! You've just called another Component in the same module!");
	}

}
