//How to run the tests:
//java -cp "out;lib/*" org.junit.runner.JUnitCore PersonTest

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() {
        person = new Person();
    }

    @After
    public void tearDown() {
        person = null;
    }

    @Test
    public void testGettersAndSetters() {
        person.setWeight(70);
        person.setHeight(1.75f);

        assertEquals(70, person.getWeight());
        assertEquals(1.75f, person.getHeight(), 0.0001f);
    }

    @Test
    public void testGetBodyMassIndex() {
        assertEquals("Underweight", person.getBodyMassIndex(60, 2.0));
        assertEquals("Normal weight", person.getBodyMassIndex(80, 2.0));
        assertEquals("Overweight", person.getBodyMassIndex(110, 2.0));
        assertEquals("Obese", person.getBodyMassIndex(140, 2.0));
    }

    @Test
    public void testBmiCategoryBoundaries() {
        // Height 2.0 means BMI = weight / 4.
        assertEquals("Underweight", person.getBodyMassIndex(73.96, 2.0)); // 18.49
        assertEquals("Normal weight", person.getBodyMassIndex(74, 2.0)); // 18.5

        assertEquals("Normal weight", person.getBodyMassIndex(99.96, 2.0)); // 24.99
        assertEquals("Overweight", person.getBodyMassIndex(100, 2.0)); // 25

        assertEquals("Overweight", person.getBodyMassIndex(119.96, 2.0)); // 29.99
        assertEquals("Obese", person.getBodyMassIndex(120, 2.0)); // 30
    }

    @Test
    public void testInvalidWeight() {
        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(-1, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(600.01, 1.75));
    }

    @Test
    public void testInvalidHeight() {
        assertEquals("Invalid input", person.getBodyMassIndex(70, 0));
        assertEquals("Invalid input", person.getBodyMassIndex(70, -0.01));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 3.01));
    }

    @Test
    public void testMaximumValidInputs() {
        assertEquals("Obese", person.getBodyMassIndex(600, 2.0));
        assertEquals("Normal weight", person.getBodyMassIndex(180, 3.0));
    }
}