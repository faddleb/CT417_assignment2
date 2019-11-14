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

    public static void main( String[] args )
    {
        System.out.println( "Hello Module!" );
    }
}
