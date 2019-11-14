package nuigalway.app;

import nuigalway.app.Course;

public class Module
{
	private String moduleName;
	private String id;
	private Student students[];
	private Course courses[];

	public Module(String moduleName, String id, Student students[], Course courses[]){
		this.moduleName = moduleName;
		this.id = id;
		this.students = students;
		this.courses = courses;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
}
