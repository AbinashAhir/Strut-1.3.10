package struts.example.domain;

public class Student {

	private int id;
	private String name;
	private String type;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", type=" + type + ", age=" + age + "]";
	}
	public Student(int id, String name, String type, int age) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
