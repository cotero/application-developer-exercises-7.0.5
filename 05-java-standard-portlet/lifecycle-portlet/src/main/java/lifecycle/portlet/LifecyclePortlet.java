package lifecycle.portlet;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"com.liferay.portlet.footer-portlet-javascript=/js/main.js",
		"javax.portlet.display-name=Lifecycle Portlet",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LifecyclePortlet extends GenericPortlet {

	@Override
	public void destroy() {
		System.out.println("\n... Destroy Phase ...\n");

		super.destroy();
	}

	@Override
	public void init() throws PortletException {
		System.out.println("\n... Init Phase ...\n");

		super.init();
	}
	
	@Override
	protected void doView(RenderRequest request, RenderResponse response)
		throws PortletException, IOException {

			PortletRequestDispatcher portletRequestDispatcher =
				getPortletContext().getRequestDispatcher("/view.jsp");

			portletRequestDispatcher.include(request, response);
	}

	@Override
	public void processAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws IOException, PortletException {

		System.out.println("\n... Action Phase ...\n");
	}

	@Override
	public void render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		System.out.println("\n... Render Phase ...\n");

		super.render(renderRequest, renderResponse);
	}

	public void serveResource(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws IOException, PortletException {

		System.out.println("\n... Serve Resource Phase ...\n");

		resourceResponse.setContentType("text/html");
		resourceResponse.getWriter().write("Resource served successfully!");
	}

}