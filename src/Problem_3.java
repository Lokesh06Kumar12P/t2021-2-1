import java.util.Scanner;

public class Problem_3 {
    public static void generateSeries(int a) {
        int limit = (a % 2 == 0) ? a - 1 : a;
        for (int i = 1; i <= limit; i++) {
            System.out.print((2 * i - 1) + (i < limit ? ", " : "\n"));
        }
    }
}
class gen{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input value
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        // Generate the series
        Problem_3.generateSeries(a);

        scanner.close();
    }
}
