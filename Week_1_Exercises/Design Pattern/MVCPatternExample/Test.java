
public class Test {

	public static void main(String[] args) {

		Student student = new Student("Ayan", "11500122132", "A+");
		StudentView view = new StudentView();

		StudentController controller = new StudentController(view, student);

		controller.Viewdetails();

		controller.setStudentName("Arnab");
		controller.setStudentId("11500122131");
		controller.setStudentGrade("A");

		controller.Viewdetails();

		controller.setStudentGrade("A+");

		controller.Viewdetails();

	}

}
