
public class EmployeeRecord {

	private Employee[] empArray = new Employee[5];
	private int Index;

	public void addEmp(Employee emp) {
		for (int i = 0; i < empArray.length; i++) {
			if (empArray[i] != null) {
				continue;
			} else {
				this.Index = i;
				break;
			}
		}
		empArray[Index] = emp;
	}

	public void searchEmp(Employee emp) {
		for (int i = 0; i < empArray.length; i++) {
			if (empArray[i] == null) {
				continue;
			} else if (empArray[i].getName() == emp.getName()) {
				System.out.println("yes " + emp.getName() + " is present");
				break;
			}
		}
	}

	public void traverseEmp() {
		for (Employee emp : empArray) {
			System.out.println(
					"Name : " + emp.getName() + " Position : " + emp.getPosition() + " salary : " + emp.getSalary());
		}
	}

	public void deleteEmp(Employee emp) {
		for (int i = 0; i < empArray.length; i++) {
			if (empArray[i] == null) {
				continue;
			} else if (empArray[i].getName() == emp.getName()) {
				empArray[i] = null;
				break;
			}
		}
	}

}
