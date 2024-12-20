package system;

/**
 * StubProjectManagementSystem is a simple implementation of the ProjectManagementSystem interface
 * used for testing purposes.
 *
 * This class provides  responses that simulate the expected behavior of the real system
 * without requiring the actual integration.
 */
public class StubProjectManagement implements InterfaceProjectManagement
{
    @Override
    public boolean addProject(String name, String description, int estimatedHours, String proposerContact, String organization) {
        // Simulate successful addition of a project
        return name != null && !name.isEmpty() && description != null && !description.isEmpty();
    }

    @Override
    public String trackProjectStatus(String projectCode) {
        // Simulate project status tracking
        if ("validCode".equals(projectCode)) {
            return "In Review"; // Simulated valid status
        }
        return null; // Simulated invalid code response
    }

    @Override
    public boolean registerForProject(String projectCode, String studentId, String partnerId, String advisorName) {
        // Ensure all required fields are non-null and non-empty
        if (projectCode == null || projectCode.isEmpty() ||
                studentId == null || studentId.isEmpty() ||
                advisorName == null || advisorName.isEmpty()) {
            return false;
        }

        return true;
    }



    @Override
    public boolean confirmRegistration(String projectCode) {
        // Simulate successful registration confirmation
        return "confirmValidCode".equals(projectCode);
    }

}
