<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>


<h1>Training Components</h1>
	<c:choose>
		<c:when test="${empty param.newText}">
		<p>	
			This is the <em>Training Portlet Component</em>. This display is contained in a JSP in the same module.
		</p>
		</c:when>
		<c:otherwise>
		<p>
			<c:out value="${param.newText }" />
		</p>
		</c:otherwise>
	</c:choose>
<a href="<portlet:actionURL name="/training/change" />">Click here to call a Controller Component to change the text</a>.