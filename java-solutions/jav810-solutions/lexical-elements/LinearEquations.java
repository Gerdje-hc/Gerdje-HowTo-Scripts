import java.util.Scanner;

public class LinearEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the coefficients in the following form:");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        System.out.println("Note: When in europe, use ',' for decimal points");

        System.out.print("Enter value for (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for (c): ");
        double c = scanner.nextDouble();

        System.out.print("Enter value for (d): ");
        double d = scanner.nextDouble();

        System.out.print("Enter value for (e): ");
        double e = scanner.nextDouble();

        System.out.print("Enter value for (f): ");
        double f = scanner.nextDouble();

        double denominator = a*d - b*c;
        double x = (e*d - b*f) / denominator;
        double y = (a*f - e*c) / denominator;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
