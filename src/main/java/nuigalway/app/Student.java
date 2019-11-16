package nuigalway.app;

import java.util.Date;
import nuigalway.app.Course;

public class Student 
{
	private String name;
	private int age;
	private Date dob;
	private int id;
	private String username;
	private Course courses[];

	public Student(String name, int age, Date dob, int id, Course[] courses){
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
		this.courses = courses;
		this.username = getUsername();
	}

    public String getUsername(){
    	String username;

    	username = this.name + this.age;
    	this.username = username;
    	return username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
}
