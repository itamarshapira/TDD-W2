package AcceptanceTests.Story2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import system.StubProjectManagement;

/**
 * STORY 2
 * Test 2 : Confirm Registration
 *
 * NOTICE: The commented section below contains the initial dummy implementation
 * used for testing before integrating the stub. It serves as a reference to the
 * earlier approach taken.
 */
public class ConfirmRegistrationTest
{
    private StubProjectManagement stubSystem; // Using the stub

    @Before
    public void setUp() {
        stubSystem = new StubProjectManagement();
    }

    @Test
    public void testConfirmRegistration_Success() {
        boolean isConfirmed = stubSystem.confirmRegistration("confirmValidCode");

        // Assert the expected success
        assertTrue("Registration should be confirmed successfully with valid details.", isConfirmed);
    }


    @Test
    public void testConfirmRegistration_Failure() {
        boolean isConfirmed = stubSystem.confirmRegistration("invalidCode");

        // Assert the expected failure
        assertFalse("Registration should not be confirmed with invalid details.", isConfirmed);
    }




//    @Test
//    public void testConfirmRegistration_Success() {
//        // Simulating successful registration confirmation
//        boolean isConfirmed = true; // Simulated response from the system
//
//        // Test assertion
//        assertTrue("Registration confirmation should be successful.", isConfirmed);
//    }
//
//    @Test
//    public void testConfirmRegistration_Failure() {
//        // Simulating failed registration confirmation due to violated constraints
//        boolean isConfirmed = false; // Simulated response from the system
//
//        // Test assertion
//        assertFalse("Registration confirmation should fail due to violated constraints.", isConfirmed);
//    }
}
