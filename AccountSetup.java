/** Jude White
 *  2/28/24
*/
import java.util.*;
public class AccountSetup{
    public static void main(String[] args){
        int length = 0;
        String password = "Hi";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String name = input.nextLine();
        while(length < 8){
            System.out.print("Enter a password that is at least 8 characters: ");
            password = input.nextLine();
            length = password.length();
        }
        input.close();
        System.out.println("Your username is " + name + " and your password is " + password);
    }
}