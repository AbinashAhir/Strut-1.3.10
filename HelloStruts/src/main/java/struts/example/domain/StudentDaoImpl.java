package struts.example.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import struts.example.db.DBConnect;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void addStudent(Student student) throws ClassNotFoundException, SQLException {

		Connection con = DBConnect.getconnection();

		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");

		ps.setInt(1, student.getId());
		ps.setString(2, student.getName());
		ps.setString(3, student.getType());
		ps.setInt(4, student.getAge());

		int i = ps.executeUpdate();

		if (i > 0) {
			System.out.println("Ok");
		} else {
			System.out.println("Not Connected");
		}

	}

	@Override
	public List<Student> showAllStudent() throws ClassNotFoundException, SQLException {

		Connection con = DBConnect.getconnection();

		PreparedStatement ps = con.prepareStatement("select * from student");

		ResultSet rs = ps.executeQuery();

		List<Student> students = new ArrayList<>();

		while (rs.next()) {

			int id = rs.getInt("id");
			System.out.println(id);
			String name = rs.getString("name");
			System.out.println(name);
			String type = rs.getString("type");
			System.out.println(type);
			int age = rs.getInt("age");
			System.out.println(age);

			System.out.println("-----------");

			Student std = new Student();
			std.setId(id);
			std.setName(name);
			std.setType(type);
			std.setAge(age);

			students.add(std);
		}
		return students;
	}

	@Override
	public void updateStudent(Student student) throws ClassNotFoundException, SQLException {

		Connection con = DBConnect.getconnection();

		PreparedStatement ps = con.prepareStatement("update student set name=?, type=?, age=? where id=?");

		ps.setInt(4, student.getId());
		ps.setString(1, student.getName());
		ps.setString(2, student.getType());
		ps.setInt(3, student.getAge());

		int i = ps.executeUpdate();

		if (i > 0) {
			System.out.println("Ok");
		} else {
			System.out.println("Not Connected");
		}
	}

	@Override
	public void deleteStudent(Student student) throws ClassNotFoundException, SQLException {
		
		Connection con = DBConnect.getconnection();

		PreparedStatement ps = con.prepareStatement("delete from student where id=?");

		ps.setInt(1, student.getId());
		

		int i = ps.executeUpdate();

		if (i > 0) {
			System.out.println("Ok");
		} else {
			System.out.println("Not Connected");
		}
	}

}
