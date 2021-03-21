import java.util.Scanner; 

public class Login {
    public static void main(String[] args) {
        try(Scanner scanner= new Scanner(System.in)) { 
            System.out.println("Enter username: "); 
            String userName = scanner.nextLine(); 
    
            System.out.println("Enter password: ");
            String password = scanner.nextLine(); 
    
            if("venera".equals(userName) &&"password".equals(password)) { 
            System.out.println("User is successfully loggined...");
            } else { 
            System.out.println("Invalid username or password...");
            } 
        }
    }
}

    