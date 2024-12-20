package AcceptanceTests.Story1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import system.StubProjectManagement;
/**
 * STORY 1
 * Test 2 : Track Project Status
 *
 * NOTICE: The commented section below contains the initial dummy implementation
 *  * used for testing before integrating the stub. It serves as a reference to the
 *  * earlier approach taken.
 */

public class TrackProjectStatusTest
{
    private StubProjectManagement stubSystem; // Using the stub

    @Before
    public void setUp() {
        stubSystem = new StubProjectManagement();
    }

    @Test
    public void testTrackProjectStatus_ValidCode() {
        // Simulate tracking a project with a valid code
        String projectStatus = stubSystem.trackProjectStatus("validCode");

        // Assert the expected behavior
        assertEquals("In Review", projectStatus);
    }

    @Test
    public void testTrackProjectStatus_InvalidCode() {
        // Simulate tracking a project with an invalid code
        String projectStatus = stubSystem.trackProjectStatus("invalidCode");

        // Assert the expected failure
        assertNull("Project status should be null for an invalid code.", projectStatus);
    }


//    @Test
//    public void testTrackStatus_ValidProjectCode() {
//        // Simulate tracking status with a valid project code
//        String projectCode = "PRJ12345";
//        String expectedStatus = "In Review"; // Placeholder for expected status
//        String actualStatus = "In Review"; // Placeholder for actual implementation
//
//        // Test assertion
//        assertEquals("The status of the project should match the expected status.", expectedStatus, actualStatus);
//    }
//
//    @Test
//    public void testTrackStatus_InvalidProjectCode() {
//        // Simulate tracking status with an invalid project code
//        String projectCode = "INVALID123";
//        String actualStatus = null; // Simulate no status returned for invalid code
//
//        // Test assertion
//        assertNull("No status should be returned for an invalid project code.", actualStatus);
//    }
}
