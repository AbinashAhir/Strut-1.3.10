package struts.example.action;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.example.domain.Student;
import struts.example.domain.StudentDao;
import struts.example.domain.StudentDaoImpl;

public class ShowStudentAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

//		StudentDao stdDao = new StudentDaoImpl();
//		stdDao.showAllStudent();
//		
//		return mapping.findForward("show");

		StudentDao stdDao = new StudentDaoImpl();

		try {
			List<Student> students = stdDao.showAllStudent();
			request.setAttribute("students", students);
		} catch (Exception e) {
			// Handle any exceptions here
			e.printStackTrace();
		}

		return mapping.findForward("show");
	}

//	private List<Student> students;
//
//    public String execute() throws ClassNotFoundException, SQLException {
//        StudentDao studentDAO = new StudentDaoImpl();
//        students = studentDAO.showAllStudent();
//        return "success";
//    }
//
//    public List<Student> getStudents() {
//        return students;
//    }
}
