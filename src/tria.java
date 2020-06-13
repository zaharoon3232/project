import java.util.Scanner;

public class tria {
    //calculate third angle if two angle are given
    public static void main(String[] args) {
        int a, b, c;

        Scanner Sc = new Scanner(System.in);
        System.out.println("enter first angle of triangle");
        a = Sc.nextInt();
        System.out.println("enter second angle of triangle");
        b = Sc.nextInt();
        c = 180 - (a + b);
        System.out.println("third angle of triangle is:" + c);

    }
}