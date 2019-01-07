package com.liferay.training.space.gradebook.portlet;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.space.gradebook.model.Assignment;

public class GradebookPortletUtil {

	public static void assembleAssignment(
		ActionRequest request, Assignment assignment)
			throws PortalException {

		ThemeDisplay themeDisplay =
			(ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		Date dueDate = extractDueDate(request);

		Map<Locale, String> title = extractTitleMap(request);

		String description = extractDescription(request);

		assignment.setCompanyId(themeDisplay.getCompanyId());
		assignment.setGroupId(themeDisplay.getScopeGroupId());
		assignment.setUserId(themeDisplay.getUserId());
		assignment.setCreateDate(DateUtil.newDate());
		assignment.setModifiedDate(DateUtil.newDate());

		assignment.setTitleMap(title);
		assignment.setDescription(description);
		assignment.setDueDate(dueDate);
	}

	/**
	 * extractDescription: Extracts the description from the request.
	 * @param request The incoming request instance.
	 * @return String The description.
	 */
	public static String extractDescription(final ActionRequest request) {
		String description = ParamUtil.getString(request, "description");

		return description;
	}

	/**
	 * extractTitleMap: Extracts the title map from the incoming request.
	 * @param request The incoming request instance.
	 * @return Map The map of locales to title strings.
	 */
	public static Map<Locale, String> extractTitleMap(
		final ActionRequest request) {

		Map<Locale, String> title =
			LocalizationUtil.getLocalizationMap(request, "title");

		return title;
	}

	/**
	 * extractDueDate: Extracts the due date form the request.
	 * @param request The incoming request instance.
	 * @return Date The due date for the assignment.
	 * @throws PortalException in case of error.
	 */
	public static Date extractDueDate(final ActionRequest request)
		throws PortalException {

		ThemeDisplay themeDisplay =
			(ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		int dueDateMonth = ParamUtil.getInteger(request, "dueDateMonth");
		int dueDateDay = ParamUtil.getInteger(request, "dueDateDay");
		int dueDateYear = ParamUtil.getInteger(request, "dueDateYear");
		int dueDateHour = ParamUtil.getInteger(request, "dueDateHour");
		int dueDateMinute = ParamUtil.getInteger(request, "dueDateMinute");
		int dueDateAmPm = ParamUtil.getInteger(request, "dueDateAmPm");

		if (dueDateAmPm == Calendar.PM) {
			dueDateHour += 12;
		}

		Date dueDate = PortalUtil.getDate(
			dueDateMonth, dueDateDay, dueDateYear, dueDateHour, dueDateMinute,
			themeDisplay.getTimeZone(), PortalException.class);

		return dueDate;
	}
}
