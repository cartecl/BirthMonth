import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth;                                                             //num birthMonth

        System.out.print("Enter your birth month [1-12]");                          //output "Enter your birth month [1-12]"
        in.hasNextInt();                                                            //input birthMonth

        if (in.hasNextInt()) {                                                      //boolean birthMonth = true
            birthMonth = in.nextInt();
            in.nextLine();
            System.out.println("Your birth month is: N");                           //output "Your birth month is: N"
        }
        else {                                                                      // if not birthMonth then
            System.out.println("You entered an incorrect month value: N");          //output "You entered an incorrect month value: N"

        }
    }
}
