package FilterPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CriteriaPatternDemo {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleOrFemale = new OrCriteria(single, female);

		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));

		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));

		System.out.println("\nSingle Males: ");
		printPersons(singleMale.meetCriteria(persons));

		System.out.println("\nSingle Or Females: ");
		printPersons(singleOrFemale.meetCriteria(persons));

		// group by fieldname
		printPersonsGroup(persons, "MarritalStatus");
	}

	public static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}

	public static void printPersonsGroup(List<Person> persons, String fieldname) {

		System.out.println("\nGroup by " + fieldname + ": ");

		Map<String, List<Person>> groupMap = null;

		if (fieldname.equalsIgnoreCase("NAME")) {
			groupMap = persons.stream().collect(Collectors.groupingBy(Person::getName));
		} else if (fieldname.equalsIgnoreCase("GENDER")) {
			groupMap = persons.stream().collect(Collectors.groupingBy(Person::getGender));
		} else {
			groupMap = persons.stream().collect(Collectors.groupingBy(Person::getMaritalStatus));
		}
		groupMap.forEach((k, v) -> {
			System.out.println(k);
			v.forEach(v1 -> {
				System.out.println("name: " + v1.getName() + ", gender: " + v1.getGender() + ", MarritalStatus: "
						+ v1.getMaritalStatus());
			});
		});
	}
}