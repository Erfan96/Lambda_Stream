import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ave ave = (a, b) -> (a + b) / 2;
        System.out.println("Please enter two numbers...");
        System.out.println("Average is : " + ave.averageTwoNumbers(s.nextDouble(), s.nextDouble()));
    }

    private interface Ave {
        double averageTwoNumbers(double a, double b);
    }
}
