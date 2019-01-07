Hello, is it me you're looking for?

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>

<portlet:defineObjects />
<form action="<portlet:actionURL />" method="post">
	<input name="<portlet:namespace/>content"></input>
	<button type="submit">Say it!</button>
</form>

<div>
	<c:out value="${param.actionResult}" />
</div>