package stringmanipulations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class StudentMgmt {
	public static class DoublyLinkedList {

		private class Node{
			Student data;
			Node prev;
			Node next;



			public Node(Student data) {
				this.data = data;
			}
		}
		private Node head;
		private Node tail;
		private int size;

		public int size() {
			return this.size;
		}

		public void insertAtEnd(Student stu) {
			if(stu == null) {
				System.err.println("Cannot insert a null student");
				return;
			}
			Node node = new Node(stu);
			if(head == null) {
				head = tail = node;
			}
			else {
				tail.next = node;
				node.prev = tail;
				tail = node;
			}
			size++;
		}

		public boolean deleteById(int stuId) {
			if(head == null) {
				System.out.println("There is nothing to delete. The list is empty");
				return false;
			}
			Node current = head;
			while (current != null) {
				if(current.data.getStuID() == stuId) {
					if(current.prev != null)
						current.prev.next = current.next;
					else
						head = current.next;

					if(current.next != null) 
						current.next.prev = current.prev;
					else
						tail = current.prev;

					size--;
					System.out.println("Removed the student: " + current.data);
					return true;
				}
				current = current.next;

			}
			System.out.println("Student with the Student Id: "+ stuId + " is not found.");
			return false;
		}

		public Student searchById(int stuId) {
			Node current = head;
			while (current != null) {
				if(current.data.getStuID() == stuId) {
					return current.data;
				}
				current = current.next;
			}
			return null;
		}

		public void displayRecordsForward() {
			if(head == null) {
				System.out.println("No records present to traverse");
				return;
			}
			System.out.println("Student records from Head -> Tail");
			Node current = head;
			while(current != null) {
				System.out.println(" "+ current.data);
				current = current.next;
			}

		}

		public void displayRecordsBackward() {
			if(tail == null) {
				System.out.println("No records present to traverse");
				return;
			}
			System.out.println("Student records from Tail -> Head");
			Node current = tail;
			while(current != null) {
				System.out.println(" "+ current.data);
				current = current.prev;
			}

		}

		public void displaySortByPercentage(boolean descending) {
			if(head == null) {
				System.out.println("The list is empty and cannot be sorted");
				return;
			}
			List<Student> list = new ArrayList<Student>(size);
			Node current = head;
			while(current != null) {
				list.add(current.data);
				current = current.next;
			}
			Comparator<Student> stucomp = Comparator.comparingDouble(Student::getPercentage);
			if(descending) {
				stucomp = stucomp.reversed();
			}
			list.sort(stucomp);

			System.out.println("Students sorted by Percentage" + (descending ? " Percentage Descreasing": " Percentage Increasing"));
			for(Student s : list ) {
				System.out.println(s);
			}
		}
	}
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

