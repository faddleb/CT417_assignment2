package nuigalway.app;

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

	public Module(String moduleName, String id, Student students[], String courses[]){
		this.moduleName = moduleName;
		this.id = id;
		this.students = students;
		this.courses = courses;
	}

    public static void main( String[] args )
    {
        System.out.println( "Hello Module!" );
    }
}
