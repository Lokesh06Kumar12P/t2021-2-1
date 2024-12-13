import java.util.Scanner;

public class Problem_2 {
        public static void generateSeries(int a) {
            for (int i = 1; i <= a; i++) {
                System.out.print((2 * i - 1) + (i < a ? ", " : "\n"));
            }
        }
}
class generator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        Problem_2.generateSeries(a);

        scanner.close();
    }
}

