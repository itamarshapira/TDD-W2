package system;

public interface InterfaceProjectManagement
{
    boolean addProject(String name, String description, int estimatedHours, String proposerContact, String organization);
    String trackProjectStatus(String projectCode);
    boolean registerForProject(String projectCode, String studentId, String partnerId, String advisorName);
    boolean confirmRegistration(String projectCode);
}
