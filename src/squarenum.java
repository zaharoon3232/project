import java.util.Scanner;

public class squarenum {

    public static void main(String[] args) {
        int num,sqr;

        Scanner Sc= new Scanner(System.in);
        System.out.println("enter number");
        num=Sc.nextInt();
        sqr=num*num;
        System.out.println("square of number is:"+sqr);

    }
}

