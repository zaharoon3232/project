import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
//Convert hours to seconds
    long hrs;
    long sec;
    Scanner userInput = new Scanner(System.in);
    System.out.println("enter hours");
    hrs=userInput.nextInt();
    sec=hrs*60*60;
    System.out.println("sec"+sec);

}}