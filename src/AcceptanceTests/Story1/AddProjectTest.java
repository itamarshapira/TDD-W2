package AcceptanceTests.Story1;

import org.junit.Test;
import static org.junit.Assert.*;
import system.StubProjectManagement;
import org.junit.Before;
/**
 * STORY 1
 * Test 1
 *
 * NOTICE: The commented section below contains the initial dummy implementation
 *  * used for testing before integrating the stub. It serves as a reference to the
 *  * earlier approach taken.
 */
public class AddProjectTest
{
    private StubProjectManagement stubSystem; // Using the stub

    @Before
    // @Before method (setUp() in my case) runs automatically before every single test method in the test class
    // This guarantees that stubSystem is freshly initialized before each test!
    public void setUp() {
        stubSystem = new StubProjectManagement();
        System.out.println("setUp executed!");
    }

    @Test
    public void testAddProject_Success() {
        // Call the stub method to simulate adding a valid project
        boolean isProjectAdded = stubSystem.addProject("Project A", "Description", 100, "test@example.com", "Test Org");

        // Assert the expected behavior
        assertTrue("Project should be added successfully with valid details.", isProjectAdded);
    }

    @Test
    public void testAddProject_Failure() {
        // Call the stub method with invalid project details
        boolean isProjectAdded = stubSystem.addProject("", "Description", 100, "test@example.com", "Test Org");

        // Assert the expected failure
        assertFalse("Project should not be added with invalid details.", isProjectAdded);
    }



//    public void testAddProjectWithValidDetails() {
//        // Simulate valid project data
//        String projectName = "Project Management System";
//        String description = "A system to manage final projects";
//        int estimatedHours = 100;
//        String proposerContact = "proposer@example.com";
//        String organization = "Example Inc";
//
//        // Simulate expected success response
//        boolean isProjectAdded = true; // Simulated response from the system
//
//        // Test assertion
//        assertTrue("Project should be added successfully with valid details", isProjectAdded);
//    }
//
//    @Test
//    public void testAddProjectWithInvalidDetails() {
//        // Simulate missing project name
//        String projectName = "";
//        String description = "A system to manage final projects";
//        int estimatedHours = 100;
//        String proposerContact = "proposer@example.com";
//        String organization = "Example Inc";
//
//        // Simulate expected failure response
//        boolean isProjectAdded = false; // Simulated response from the system
//
//        // Test assertion
//        assertFalse("Project should not be added due to missing project name.", isProjectAdded);
//    }
}
