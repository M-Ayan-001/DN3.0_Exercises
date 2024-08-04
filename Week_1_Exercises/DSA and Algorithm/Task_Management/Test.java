
public class Test {
	public static void main(String args[]) {

		SinglyLinkedList newtask = new SinglyLinkedList();

		newtask.add(new Task(1, "coding", "pending"));
		newtask.add(new Task(2, "writing", "pending"));
		newtask.add(new Task(3, "testing", "in progess"));
		newtask.add(new Task(4, "commit", "complete"));

		newtask.tarverse();

		System.out.println();

		int key = 2;
		System.out.println("find the taskId :- " + key);
		Task target = newtask.serach(key);
		if (target != null) {
			System.out.println("found the task id " + target.taskId);
		}

		System.out.println();

		int deleteTaskid = 2;
		boolean deleted = newtask.delete(deleteTaskid);
		if (deleted != true) {
			System.out.println("Task with id" + deleteTaskid + " is not founded");

		} else {
			System.out.println("Task with id" + deleteTaskid + " is successfully deleted");
		}

		System.out.println();

		System.out.println("the task list are as follows: ");
		newtask.tarverse();

	}
}
