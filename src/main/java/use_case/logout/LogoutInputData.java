package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {
    private final String username;

    /**
     * Constructs a LogoutInputData with the given username.
     * @param username the username of the user logging out
     */
    public LogoutInputData(String username) {
        this.username = username;
    }

    /**
     * Getter for the username.
     * @return the username of the user logging out
     */
    public String getUsername() {
        return username;
    }

}
