package stringmanipulations;

public class StudentMgmt {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertAtEnd(new Student(10, "Gokul", 20, 78.45f));
		dll.insertAtEnd(new Student(20, "Rahul", 21, 78.75f));
		dll.insertAtEnd(new Student(30, "Deepesh", 20, 88.45f));
		dll.insertAtEnd(new Student(40, "Krish", 20, 68.45f));
		dll.insertAtEnd(new Student(50, "Muthu", 40, 38.45f));

		//Displaying the records from head to tail:
		dll.displayRecordsForward();
		System.out.println();
		//Displaying the records from tail to head:
		dll.displayRecordsBackward();


		//search for student
		int stuid = 30;
		Student searched_stu = dll.searchById(stuid);
		if(searched_stu != null) {
			System.out.println("Student found with the id: " + stuid);
		}
		else {
			System.out.println("Student not found with the id: " + stuid);
		}
		System.out.println();


		//sort the record by percentage descending
		System.out.println("Displaying the records by percentage Descending");
		dll.displaySortByPercentage(true);

		//sort the record by percentage descending
		System.out.println("Displaying the records by percentage Ascending");
		dll.displaySortByPercentage(false);


		//delete by id
		dll.deleteById(50);
		dll.displayRecordsForward();

		// delete a record that doesn't exist
		dll.deleteById(40000);
		dll.displayRecordsForward();

	}
}

