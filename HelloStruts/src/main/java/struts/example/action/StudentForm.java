package struts.example.action;

import org.apache.struts.action.ActionForm;

public class StudentForm extends ActionForm{

	
	private int std_id;
	private String std_name;
	private String std_type;
	private int std_age;
	
	
	public StudentForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_type() {
		return std_type;
	}
	public void setStd_type(String std_type) {
		this.std_type = std_type;
	}
	public int getStd_age() {
		return std_age;
	}
	public void setStd_age(int std_age) {
		this.std_age = std_age;
	}
	public StudentForm(int std_id, String std_name, String std_type, int std_age) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_type = std_type;
		this.std_age = std_age;
	}
	@Override
	public String toString() {
		return "StudentForm [std_id=" + std_id + ", std_name=" + std_name + ", std_type=" + std_type + ", std_age="
				+ std_age + "]";
	}
	
	
	
}
