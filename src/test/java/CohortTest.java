import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {
    Cohort umbriel = new Cohort();

    @Test
    public void testAddStudent(){
        umbriel.addStudent(new Student(1234567890,"Old Greg"));
        assertNotNull(umbriel);
    }

}
