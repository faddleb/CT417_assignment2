package nuigalway.app;

import org.joda.time.DateTime;
import nuigalway.app.Module;
import nuigalway.app.Student;

public class Course 
{
	private String courseName;
	private Module[] modules;
	private Student[] students;
	private DateTime startDate;
	private DateTime endDate;

	public Course(String courseName, Module[] modules, Student[] students, DateTime startDate, DateTime endDate) {
		this.courseName = courseName;
		this.modules = modules;
		this.students = students;
		this.startDate = startDate;
		// this.endDate = endDate;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Module[] getModules() {
		return modules;
	}

	public void setModules(Module[] modules) {
		this.modules = modules;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

}
