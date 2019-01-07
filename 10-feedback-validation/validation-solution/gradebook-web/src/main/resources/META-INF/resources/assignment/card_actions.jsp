<%@ include file="/init.jsp"%>

<liferay-ui:icon-menu markupView="lexicon">
	<portlet:renderURL var="editAssignmentURL">
		<portlet:param name="mvcRenderCommandName"
			value="/gradebook/assignment/edit" />
		<portlet:param name="redirect" value="${currentURL}" />
		<portlet:param name="assignmentId" value="${SEARCH_CONTAINER_RESULT_ROW.object.assignmentId}" />
	</portlet:renderURL>

	<liferay-ui:icon message="Edit" url="${editAssignmentURL}" />

	<portlet:actionURL name="/gradebook/assignment/delete"
		var="deleteAssignmentURL">
		<portlet:param name="redirect" value="${currentURL}" />
		<portlet:param name="assignmentId" value="${SEARCH_CONTAINER_RESULT_ROW.object.assignmentId}" />
	</portlet:actionURL>

	<liferay-ui:icon-delete url="${deleteAssignmentURL}" />  
</liferay-ui:icon-menu> 