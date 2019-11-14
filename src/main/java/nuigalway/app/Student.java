package nuigalway.app;

public class Student 
{
	private String name;
	private int age;
	private Date dob;
	private int id;
	private String username;
	private String courses[];

	public Student(String name, int age, Date dob, int id, String courses[]){
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
		this.courses = courses;
		this.username = getUsername();
	}

    public static void main( String[] args )
    {
        System.out.println( "Hello Student!" );
    }

    public String getUsername(){
    	String username;

    	username = this.name + this.age;
    	this.username = username;
    	return username;
    }
}
