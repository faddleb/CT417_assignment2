package nuigalway.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class ModuleTest 
{
    // Mock variables
    String mockModuleName = "Software Engineering";
    String mockId = "CT417";
    Course mockCourse = mock(Course.class);
    Student mockStudent = mock(Student.class);

    // Mock arrays
    Course[] mockCourseList = {mockCourse, mockCourse};
    Student[] mockStudentList = {mockStudent, mockStudent};

    @Test
    public void shouldConstructModuleObjectWithParameters()
    {   
        Module module = new Module(mockModuleName, mockId, mockStudentList, mockCourseList);

        assertTrue(module instanceof Module);
        assertEquals(module.getModuleName(), mockModuleName);
        assertEquals(module.getId(), mockId);
        assertArrayEquals(module.getStudents(), mockStudentList);
        assertArrayEquals(module.getCourses(), mockCourseList);
    }
}
