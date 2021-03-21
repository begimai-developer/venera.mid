import java.util.Scanner; 

public class Registration { 
    public static void main (String[] args) { 
        Register register = new Register(); 
        try(Scanner scanner = new Scanner(System.in)) { 
            
        System.out.print("Enter first name: "); 
        String firstName = scanner.nextLine();
        register.setFirstName(firstName);
        
        System.out.print("Enter last name: "); 
        String lastName = scanner.nextLine();
        register.setLastName(lastName);
        
        System.out.print("emailId: "); 
        String emailId = scanner.nextLine();
        register.setEmailId(emailId);
        
        System.out.print("Enter password: "); 
        String password = scanner.nextLine(); 
        register.setPassword(password); 
        
        System.out.println("Phone number: "); 
        long phoneNum = scanner.nextLong(); 
        register.setPhoneNum(phoneNum); 
        
        printRegisterData(register); 
        } 
    } 
        private static void printRegisterData(Register register) {
            System.out.println(register.getFirstName());
            System.out.println(register.getLastName());
            System.out.println(register.getEmailId());
            System.out.println(register.getPassword());
            System.out.println(register.getPhoneNum());
        }
    }
    
    
class Register { 
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    private long phoneNum;
    
    public String getFirstName() { 
        return firstName; 
    } 
    public void setFirstName(String firstName) { 
        this.firstName = firstName; 
    } 
    public String getLastName() { 
        return lastName; 
    } 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    } 
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) { 
        this.emailId = emailId; 
    }
    public String getPassword() { 
        return password; 
    }
    public void setPassword(String password) { 
        this.password = password;
    } 
    public long getPhoneNum(long phoneNum) {
        return phoneNum; 
    }
    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    } 
}