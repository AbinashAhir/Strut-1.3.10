package struts.example.domain;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
	public void addStudent(Student student) throws ClassNotFoundException, SQLException;

	public List<Student> showAllStudent() throws ClassNotFoundException, SQLException;

	public void updateStudent(Student std) throws ClassNotFoundException, SQLException;

	public void deleteStudent(Student std) throws ClassNotFoundException, SQLException;
}
