public class Account {
    public final String username;
    public String displayName;
    private String password;
    private static int users = 0;

    public Account(String username, String displayName, String password) {
        this.username = username;
        this.displayName = displayName;
        this.password = password;
        users++;
        System.out.println("Current user count: " + users);
    }
}
