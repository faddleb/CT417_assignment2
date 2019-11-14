package nuigalway.app;

public class Module 
{
	private String moduleName;
	private String id;
	private String students[];
	private String courses[];

	public Module(String moduleName, String id, String students[], String courses[]){
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
