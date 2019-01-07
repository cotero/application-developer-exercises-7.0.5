package com.liferay.training.space.gradebook.validator;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.training.space.gradebook.model.Assignment;

public class AssignmentValidator {

	public static boolean isAssignmentValid(
			Assignment assignment) {

		boolean result = true;

		if (!assignment.isNew()) {
			if (Validator.isNull(assignment.getAssignmentId())) {
				result = false;
			}
		}

		result &= isTitleValid(assignment.getTitle());
		result &= isDueDateValid(assignment.getDueDate());
		result &= isDescriptionValid(assignment.getDescription());

		return result;
	}

	/**
	 * isAssignmentValid: Determines if the given fields are valid for an assignment.
	 * @param titleMap
	 * @param description
	 * @param dueDate
	 * @return boolean <code>true</code> if the fields are valid, otherwise they are not.
	 */
	public static boolean isAssignmentValid(final Map<Locale, String> titleMap, final String description, final Date dueDate) {
		boolean result = true;

		result &= isTitleValid(titleMap, errors);
		result &= isDueDateValid(dueDate, errors);
		result &= isDescriptionValid(description, errors);

		return result;
	}

	/**
	 * isDescriptionValid: Determines if the description is valid.
	 * @param description
	 * @return boolean <code>true</code> if the description is valid, otherwise it is not.
	 */
	public static boolean isDescriptionValid(final String description) {
		boolean result = true;

		if (Validator.isBlank(HtmlUtil.stripHtml(description))) {
			result = false;
		}

		return result;
	}

	/**
	 * isDueDateValid: Determines if the due date is valid.
	 * @param dueDate
	 * @return boolean <code>true</code> if the due date is valid, otherwise it is not.
	 */
	public static boolean isDueDateValid(final Date dueDate) {
		boolean result = true;

		if (Validator.isNull(dueDate)) {
			result = false;
		}

		return result;
	}

	/**
	 * isTitleValid: Determines if the title map is valid.
	 * @param titleMap
	 * @return boolean <code>true</code> if the title map is valid, otherwise it is not.
	 */
	public static boolean isTitleValid(final Map<Locale, String> titleMap) {

		boolean result = true;

		// verify the map has something
		if (MapUtil.isEmpty(titleMap)) {
			result = false;
		} else {
			// get the default locale
			Locale defaultLocale = LocaleUtil.getSiteDefault();

			result = isTitleValid(titleMap.get(defaultLocale), errors);
		}

		// get the default title string

		return result;
	}

	/**
	 * isTitleValid: Verifies the title string is valid.
	 * @param title
	 * @return boolean <code>true</code> if the title is valid, otherwise it is not.
	 */
	public static boolean isTitleValid(final String title) {

		boolean result = true;

		if ((Validator.isBlank(title))) {
			result = false;
		}

		return result;
	}
}