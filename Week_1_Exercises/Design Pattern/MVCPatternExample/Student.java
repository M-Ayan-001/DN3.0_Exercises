
public class Student {

	private String name;
	private String ID;
	private String grade;

	public Student(String name, String ID, String grade) {
		this.grade = grade;
		this.ID = ID;
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
