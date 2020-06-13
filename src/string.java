import java.util.Scanner;
//Lenght of string
public class string {

    public static void main(String[] args) {
        int len;
        String str;

        Scanner Sc = new Scanner(System.in);
        System.out.println("enter your string");
        str = Sc.nextLine();
        len = str.length();
        System.out.println("lenght of string is:" + len);

    }


}
