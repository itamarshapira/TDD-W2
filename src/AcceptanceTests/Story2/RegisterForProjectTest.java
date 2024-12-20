package AcceptanceTests.Story2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import system.StubProjectManagement;

/**
 * STORY 2
 * Test 1: Register for a Project
 *
 * NOTICE: The commented section below contains the initial dummy implementation
 * used for testing before integrating the stub. It serves as a reference to the
 * earlier approach taken.
 */

public class RegisterForProjectTest {

    private StubProjectManagement stubSystem; // Using the stub

    @Before
    public void setUp() {
        stubSystem = new StubProjectManagement();
    }

    @Test
    public void testRegisterForProject_Success() {
        // Simulate registering for a project with valid details
        boolean isRegistered = stubSystem.registerForProject(
                "validProjectID",
                "123456789",
                "987654321",
                "Dr. Smith"
        );

        // Assert the expected success
        assertTrue("Project should be registered successfully with valid details.", isRegistered);
    }

    @Test
    public void testRegisterForProject_Failure() {
        // Simulate registering for a project with missing or invalid details
        boolean isRegistered = stubSystem.registerForProject(
                "",
                "123456789",
                "",
                "Dr. Smith"
        );

        // Assert the expected failure
        assertFalse("Project registration should fail due to invalid or missing details.", isRegistered);
    }


//    @Test
//    public void testRegisterForProject_Success() {
//        // Simulating successful registration with complete and valid details
//        boolean isRegistered = true; // Simulated response from the system
//        String accessCode = "ABC123"; // Simulated access code
//
//        // Test assertions
//        assertTrue("The registration should be successful.", isRegistered);
//        assertNotNull("Access code should be generated on successful registration.", accessCode);
//    }
//
//    @Test
//    public void testRegisterForProject_Failure() {
//        // Simulating failed registration due to missing or invalid details
//        boolean isRegistered = false; // Simulated response from the system
//        String accessCode = null; // No access code should be generated
//
//        // Test assertions
//        assertFalse("The registration should fail due to invalid details.", isRegistered);
//        assertNull("Access code should not be generated on failed registration.", accessCode);
//    }
}