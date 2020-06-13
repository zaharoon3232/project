import java.util.Scanner;

public class concatenate {
    //concatenate two string
   public static void main (String[] args) {


        String str1;
        String str2;
        String str3;
       Scanner userInput = new Scanner(System.in);
       System.out.println("enter the first string");
       str1  = userInput.next();
        System.out.println("enter the second string");
        str2= userInput.next();

        str3= str1 + str2;
        System.out.println("str3");

    }

}