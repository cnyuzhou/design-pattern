package DAOPattern;

public class DAOPatternDemo {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();

		// ������е�ѧ��
		System.out.println("Initlized all students:");
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}
		
		System.out.println("");
		System.out.println("Updating rollNo=0 student:");
		// ����ѧ��
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
		
		System.out.println("");
		System.out.println("Updated rollNo=0 student:");
		// ��ȡѧ��
		studentDao.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		
		System.out.println("");		
		System.out.println("Add rollNo=10 student:");
		// ����ѧ��
		student = new Student("addStudent", 10);
		studentDao.addStudent(student);
		
		System.out.println("");
		System.out.println("Added all students:");
		// ������е�ѧ��
		for (Student student1 : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student1.getRollNo() + ", Name : " + student1.getName() + " ]");
		}
		
		System.out.println("");
		System.out.println("Deleting rollNo=10 student:");
		// ɾ��ѧ��
		studentDao.getStudent(10);
		studentDao.deleteStudent(student);
		
		System.out.println("");
		System.out.println("Deleted all students:");
		// ������е�ѧ��
		for (Student student1 : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student1.getRollNo() + ", Name : " + student1.getName() + " ]");
		}
	}
}
