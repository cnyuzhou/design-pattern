package DAOPattern;

public class DAOPatternDemo {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();

		// 输出所有的学生
		System.out.println("Initlized all students:");
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}
		
		System.out.println("");
		System.out.println("Updating rollNo=0 student:");
		// 更新学生
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
		
		System.out.println("");
		System.out.println("Updated rollNo=0 student:");
		// 获取学生
		studentDao.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		
		System.out.println("");		
		System.out.println("Add rollNo=10 student:");
		// 增加学生
		student = new Student("addStudent", 10);
		studentDao.addStudent(student);
		
		System.out.println("");
		System.out.println("Added all students:");
		// 输出所有的学生
		for (Student student1 : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student1.getRollNo() + ", Name : " + student1.getName() + " ]");
		}
		
		System.out.println("");
		System.out.println("Deleting rollNo=10 student:");
		// 删除学生
		studentDao.getStudent(10);
		studentDao.deleteStudent(student);
		
		System.out.println("");
		System.out.println("Deleted all students:");
		// 输出所有的学生
		for (Student student1 : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student1.getRollNo() + ", Name : " + student1.getName() + " ]");
		}
	}
}
