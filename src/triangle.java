import java.util.Scanner;

public class triangle {
    //area of triangle
    public static void main(String[] args) {
        int area=0;

        Scanner Sc= new Scanner(System.in);
        System.out.println("enter width");
        int w=Sc.nextInt();
        System.out.println("enter height");
        int h=Sc.nextInt();
        area=w*h/2;
        System.out.println("area of traingle is:"+area);

    }
}



