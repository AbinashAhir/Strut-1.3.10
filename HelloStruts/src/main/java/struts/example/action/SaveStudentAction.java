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

public class SaveStudentAction extends Action{
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	
	
	StudentForm stdForm = (StudentForm) form;
	
//	String id = request.getParameter("std_id");
//	String name = request.getParameter("std_name");
//	String type = request.getParameter("std_type");
	
	System.out.println("Id : "+stdForm.getStd_id()+" name : "+stdForm.getStd_name()+" type : "+stdForm.getStd_type()+" age: "+stdForm.getStd_age());
	
	
	Student std = new Student();
	
	std.setId(stdForm.getStd_id());
	std.setName(stdForm.getStd_name());
	std.setType(stdForm.getStd_type());
	std.setAge(stdForm.getStd_age());
	
	StudentDao stdDao = new StudentDaoImpl();
	stdDao.addStudent(std);
	
	
	
	return mapping.findForward("save");
}
}
