<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<p>This is the <b>Demo Portlet</b> portlet in View mode.</p>

<!-- Render URL-->
<p><a href="<portlet:renderURL/>">Click to invoke Render Phase</a></p>

<!-- Action URL -->
<p><a href="<portlet:actionURL/>">Click to invoke Action Phase</a></p>

<!-- Resource URL -->
<p><a href="" onclick="loadXMLDoc('<portlet:resourceURL/>'); return false">Click to invoke Resource Serving Phase</a></p>
 
<div style="font: 16pt courier" id="myDiv"></div>
