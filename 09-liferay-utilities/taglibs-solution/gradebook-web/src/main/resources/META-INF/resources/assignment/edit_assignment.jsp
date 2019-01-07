<%@ include file="/init.jsp"%>

<%
	Assignment assignment =
		(Assignment) request.getAttribute("assignment");
	String redirect = request.getParameter("redirect");
	String title = (String) request.getAttribute("title");
	String description = "";
	
	if (assignment != null) {
		description = assignment.getDescription();
	}

	renderResponse.setTitle(title);
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);
%>


<c:choose>
	<c:when test="${not empty assignment}">
		<portlet:actionURL var="assignmentActionURL"
			name="/gradebook/assignment/edit">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>
	</c:when>
	<c:otherwise>
		<portlet:actionURL var="assignmentActionURL"
			name="/gradebook/assignment/add">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>
	</c:otherwise>
</c:choose>
<div class="container-fluid-1280">

	<aui:model-context bean="<%=assignment%>" model="<%=Assignment.class%>" />

	<aui:form name="fm" action="${assignmentActionURL}" 
			onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "savePage();" %>' >

		<aui:input name="assignmentId" field="assignmentId" type="hidden" />
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset>
				<aui:input name="title" />


				<aui:field-wrapper required="true">
					<label for="description"><liferay-ui:message key="description" /></label>	
						<liferay-ui:input-editor contents="${assignment.description}"
						 editorName='alloyeditor'
						 name="descriptionEditor" placeholder="description" />
					<aui:input name="description" type="hidden" />
					</aui:field-wrapper>


				<aui:input name="dueDate" />
			</aui:fieldset>
		</aui:fieldset-group>
		<aui:button cssClass="btn-lg" type="submit" />
	</aui:form>

</div>

<aui:script>
	function <portlet:namespace />savePage() {
		var form = AUI.$(document.<portlet:namespace />fm);

		var descriptionEditor = window.<portlet:namespace />descriptionEditor;

		form.fm('description').val(descriptionEditor.getHTML());

		submitForm(form);
	}
</aui:script>
