
public class Test {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Ayan", "Intern", 0.0);
		Employee emp2 = new Employee("Sayan", "SDE I", 1200000.0);
		Employee emp3 = new Employee("Arnab", "CEO", 9000000.0);
		Employee emp4 = new Employee("Atanu", "Intern", 0.0);
		Employee emp5 = new Employee("Gourav", "FSE", 30000.0);

		EmployeeRecord empRec = new EmployeeRecord();
		empRec.addEmp(emp1);
		empRec.addEmp(emp2);
		empRec.addEmp(emp3);
		empRec.addEmp(emp4);
		empRec.addEmp(emp5);

		empRec.traverseEmp();

		System.out.println();

		empRec.searchEmp(emp3);

		empRec.deleteEmp(emp5);

		System.out.println();

		empRec.traverseEmp(); // problem stays because this is a normal array where in place of deleted object
								// I kept a null value

	}

}
