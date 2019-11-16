package nuigalway.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Date;

import org.junit.Test;

public class StudentTest 
{
    // Mock variables
    String mockStudentName = "Faddle";
    int mockAge = 21;
    Date mockDob = mock(Date.class);
    int mockId = 16500436;
    Course mockCourse = mock(Course.class);

    // Mock arrays
    Course[] mockCourseList = {mockCourse, mockCourse};

    @Test
    public void shouldConstructStudentObjectWithParameters()
    {   
        Student student = new Student(mockStudentName, mockAge, mockDob, mockId, mockCourseList);

        assertTrue(student instanceof Student);
        assertEquals(student.getName(), mockStudentName);
        assertEquals(student.getAge(), mockAge);
        assertEquals(student.getDob(), mockDob);
        assertEquals(student.getId(), mockId);
        assertArrayEquals(student.getCourses(), mockCourseList);
    }

    @Test
    public void shouldConcatenateNameAndAgeToGenerateUsername(){
        String name = "Faddle";
        int age = 21;
        Student student = new Student(name, age, mockDob, mockId, mockCourseList);        

        assertEquals(student.getUsername(), name + age);
    }
}
