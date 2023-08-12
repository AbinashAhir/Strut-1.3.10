package struts.example.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, javax.servlet.http.HttpServletRequest request,
			javax.servlet.http.HttpServletResponse response) throws Exception {

		System.out.println("I am inside execute() of HelloWorldAction.");
		
		
		return mapping.findForward("hello");
		

//		return super.execute(mapping, form, request, response);
		
//		if(request.getParameter("name").equals("abinash")) {
//			return mapping.findForward("abinash");
//		}else {
//			return mapping.findForward("unknown");
//		}

		
	}

}
