package system;

public class RealProjectManagement implements InterfaceProjectManagement
{

    /**
     * RealProjectManagementSystem is the actual implementation of the ProjectManagementSystem interface.
     * This class is intended to
     * the full functionality required for managing projects in the project management system.
     */
    @Override
    public boolean addProject(String name, String description, int estimatedHours, String proposerContact, String organization) {
        // TODO: Implement the REAL logic to add a project to the system

        return false;
    }

    @Override
    public String trackProjectStatus(String projectCode) {
        // TODO: Implement the REAL logic to track the status of a project

        return projectCode;
    }

    @Override
    public boolean registerForProject(String projectCode, String studentId, String partnerId, String advisorName) {
        // TODO: Implement the REAL logic to register a student for a project

        return false;
    }

    @Override
    public boolean confirmRegistration(String projectCode) {
        // TODO: Implement the REAL logic to confirm registration for a project

        return false; // Placeholder
    }
}
