import java.util.Scanner;
//Reminder of two number
public class reminder {
    public static void main(String[] args) {
        int reminder,divident,divisor;

        Scanner Sc= new Scanner(System.in);
        System.out.println("enter divident");
        divident=Sc.nextInt();
        System.out.println("enter divisor");
        divisor=Sc.nextInt();
        reminder=divident%divisor;
        System.out.println("reminder of two number is::"+reminder);

    }
}

