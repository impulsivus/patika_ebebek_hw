import java.util.Scanner; 

public class App {
    static String username = "defaultusername";
    static String password = "defaultpassword";
    static String promptUsername;
    static String promptPassword;

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Username");
        promptUsername = s.next();
        System.out.println("Password");
        promptPassword = s.next();

        if (promptUsername == null) {
            System.out.println("Username cannot be empty");
            return;
        }
        if (promptPassword == null) {
            System.out.println("Password cannot be empty");
            return;
        }
        if (promptPassword.contentEquals(password) && promptUsername.contentEquals(username)) {
            System.out.println("Success");
            return;
        }
        if (!promptPassword.contentEquals(password)) {
            System.out.println("Invalid password. Reset?");
            System.out.println("1 - Yes 2 - No");
            if (s.nextInt() == 1) {
                System.out.println("Please enter new password");
                String newPassword = s.next();
                if(newPassword.contentEquals(password)) {System.out.println("Old and new password cannot be the same");return;}
                password = newPassword;                
                main(null);
            }
        }
    }
}
