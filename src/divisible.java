import java.util.Scanner;

public class divisible {
    //Divisible by 5
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        System.out.println("enter number");
       int num = userInput.nextInt();
        if (num % 5 == 0) {
            System.out.println("number is divisible by 5");
        } else {
            System.out.println("number is not divisible by 5");
        }
    }
}