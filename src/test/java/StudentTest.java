import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {
    private ArrayList<Student> students;
    @Before
    public void setup(){
        this.students = new ArrayList<>();
        this.students.add(new Student(1234567890,"Jeremiah"));
    }

    @Test
    public void testIfStudentsIsInitialized(){
        assertNotNull(students);
    }

    @Test
    public void testStudentAdd(){
        assertEquals(1,this.students.size());
        this.students.add(new Student(1234567809, "Jody"));
        assertEquals(2,this.students.size());
    }

    @Test
    public void testStudentID(){
        assertEquals(1234567890,this.students.get(0).getId());
    }

    @Test
    public void testStudentName(){
        assertEquals("Jeremiah",this.students.get(0).getName());
    }

    @Test
    public void testAddGrade(){
        assertEquals(0,this.students.get(0).grades.size());
        this.students.get(0).addGrades(95);
        assertEquals(1,this.students.get(0).grades.size());
    }

    @Test
    public void testGetGrades(){
        this.students.get(0).addGrades(95);
        this.students.get(0).addGrades(90);
        assertSame(this.students.get(0).getGrades(), this.students.get(0).getGrades());
    }

    @Test
    public void testGradeAverage(){
        this.students.get(0).addGrades(90);
        this.students.get(0).addGrades(90);
        this.students.get(0).addGrades(90);
        assertEquals(90.0,this.students.get(0).getGradeAverage(),0);
    }

    @Test
    public void testUpdateGrade(){
        this.students.get(0).addGrades(90);
        this.students.get(0).updateGrade(0, 95);
        assertEquals(this.students.get(0).getGrades().get(0), this.students.get(0).getGrades().get(0));
    }
    @Test
    public void testDeleteGrade(){
        this.students.get(0).addGrades(95);
        assertEquals(1,this.students.get(0).grades.size());
        this.students.get(0).deleteGrade(0);
        assertEquals(0,this.students.get(0).grades.size());
    }
}
