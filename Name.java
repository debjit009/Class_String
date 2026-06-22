import java.util.Scanner; 
public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First name:");
        String FirstName = sc.nextLine();

        System.out.println("Enter Last name:");
        String LastName = sc.nextLine();

        System.out.println("Full name is:"+FirstName+" "+LastName);
        
    }
    
}
