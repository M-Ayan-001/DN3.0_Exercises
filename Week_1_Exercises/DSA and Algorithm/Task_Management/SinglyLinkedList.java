
public class SinglyLinkedList {
	Node head;

	public void add(Task task) {
		Node newnode = new Node(task);
		if (head == null) {
			head = newnode;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newnode;

		}
	}

	public Task serach(int taskId) {
		Node curr = head;
		while (curr != null) {
			if (curr.task.taskId == taskId) {
				return curr.task;
			}
			curr = curr.next;
		}
		return null;
	}

	public void tarverse() {
		Node curr = head;
		while (curr.next != null) {
			curr.task.display();
			curr = curr.next;
		}
	}

	public boolean delete(int taskId) {
		if (head == null) {
			return false;
		}
		if (head.task.taskId == taskId) {
			head = head.next;
			return true;
		}
		Node curr = head;
		while (curr.next != null && curr.next.task.taskId != taskId) {
			curr = curr.next;
		}
		if (curr.next == null) {
			return false;
		}
		curr.next = curr.next.next;
		return true;

	}
}
