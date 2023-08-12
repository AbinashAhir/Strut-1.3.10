package struts.example.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.example.domain.Student;
import struts.example.domain.StudentDao;
import struts.example.domain.StudentDaoImpl;

public class DeleteStudentAction2 extends Action{
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	
	StudentForm stdForm = (StudentForm) form;

//	String id = request.getParameter("std_id");
//	String name = request.getParameter("std_name");
//	String type = request.getParameter("std_type");

		System.out.println("Id : " + stdForm.getStd_id());

		Student std = new Student();

		std.setId(stdForm.getStd_id());

		StudentDao stdDao = new StudentDaoImpl();
		stdDao.deleteStudent(std);

	return mapping.findForward("delete2");
}
}
