import java.util.ArrayList;
import java.util.LinkedList;



public class TestMain {

	public static void main(String[] args) {

		// make variables of Student and add it into ArrayList and Linked list
		// as follow.

		Student student1 = new Student(1, "Hitesh", "M.Sc (Computer Science)");
		Student student2 = new Student(2, "Pradhunya", "M.Sc (Computer Science)");
		Student student3 = new Student(3, "Komal", "M.Sc (Computer Science)");

		Student student4 = new Student();
		student4.setRollno(4);
		student4.setName("Nikita");
		student4.setCourse("M.Sc (Computer Science)");

		// 1) ArrayList
		ArrayList<Student> arrayList = new ArrayList<Student>();

		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);

		System.out.println("\n**** Array List ***");
		arrayList.forEach(System.out::println);

		// 2) LinkedList
		LinkedList<Student> linkedList = new LinkedList<Student>();

		linkedList.add(student1);
		linkedList.add(student2);
		linkedList.add(student3);
		linkedList.add(student4);

		System.out.println("\n\n**** Linked List ***");
		linkedList.forEach((stud) -> System.out.println(stud));

	}

}
