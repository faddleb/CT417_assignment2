package nuigalway.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.joda.time.DateTime;
import org.junit.Test;

public class CourseTest 
{
    // Mock variables
    String mockCourseName = "CS&IT";
    DateTime mockStartDate = new DateTime();
    DateTime mockEndDate = new DateTime();
    Course mockCourse = mock(Course.class);
    Student mockStudent = mock(Student.class);
    Module mockModule = mock(Module.class);

    // Mock arrays
    Course[] mockCourseList = {mockCourse, mockCourse};
    Student[] mockStudentList = {mockStudent, mockStudent};
    Module[] mockModuleList = {mockModule, mockModule};

    @Test
    public void shouldConstructCourseObjectWithParameters()
    {   
        Course course = new Course(mockCourseName, mockModuleList, mockStudentList, mockStartDate, mockEndDate);
        
        assertTrue(course instanceof Course);
        assertEquals(course.getCourseName(), mockCourseName);
        assertArrayEquals(course.getModules(), mockModuleList);
        assertArrayEquals(course.getStudents(), mockStudentList);
        assertEquals(course.getStartDate(), mockStartDate);
        assertEquals(course.getEndDate(), mockEndDate);
    }
}
