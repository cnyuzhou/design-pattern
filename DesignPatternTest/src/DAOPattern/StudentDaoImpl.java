package DAOPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	// �б��ǵ���һ�����ݿ�
	List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert", 0);
		Student student2 = new Student("John", 1);
		students.add(student1);
		students.add(student2);
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student);
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

	// �����ݿ��м���ѧ������
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		for (Student student : students) {
			if (student.getRollNo() == rollNo)
				return student;
		}
		return null;
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	}

	@Override
	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Student: Roll No " + student.getRollNo() + ", added in the database");
	}
}