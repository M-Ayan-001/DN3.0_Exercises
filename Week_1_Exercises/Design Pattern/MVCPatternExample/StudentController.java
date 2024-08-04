
public class StudentController {

	private StudentView view;
	private Student model;

	public StudentController(StudentView view, Student model) {
		this.model = model;
		this.view = view;
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentId(String id) {
		model.setID(id);
	}

	public String getStudentId() {
		return model.getID();
	}

	public void setStudentGrade(String grade) {
		model.setGrade(grade);
	}

	public String getStudentGrade() {
		return model.getGrade();
	}

	public void Viewdetails() {
		view.displayStudentDetails(model.getName(), model.getID(), model.getGrade());
	}

}
