package nuigalway.app;

import org.joda.time.DateTime;
import nuigalway.app.Module;
import nuigalway.app.Student;

public class Course 
{
	private String courseName;
	private Module modules[];
	private Student students[];
	// TODO: Install Joda Time Classes
	private DateTime startDate;
	private DateTime endDate;

	public Course(String courseName, Module modules[], Student students[], DateTime startDate, DateTime endDate) {
		this.courseName = courseName;
		this.modules = modules;
		this.students = students;
		this.startDate = startDate;
		this.endDate = endDate;
	}

    public static void main( String[] args )
    {
        System.out.println( "Hello Module!" );
    }
}
