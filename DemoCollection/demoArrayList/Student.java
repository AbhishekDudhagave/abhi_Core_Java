package DemoCollection.demoArrayList;

public class Student {
	String name;
	int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Student(){

	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", id=" + id +
				'}';
	}
}