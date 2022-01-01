import java.util.Scanner;

public class Exception  {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value for a");
        int a = scan.nextInt();
        System.out.println("enter the value for b");
        int b = scan.nextInt();
        int c=0;
        try {
            c = a / b;
        } catch (ArithmeticException I) {

            System.out.println("the denominator should not be a zero");
        }
        System.out.println(c);

    }
}
