import java.util.Scanner;
//perimeter of rectangle
public class perimeter {

    public static void main(String[] args) {
        int per = 0;

        Scanner Sc= new Scanner(System.in);
        System.out.println("enter lenght");
        int l=Sc.nextInt();
        System.out.println("enter width");
        int w=Sc.nextInt();
        per=2*(l+w);
        System.out.println("perimeter of rectangle is:"+per);

}
    }

