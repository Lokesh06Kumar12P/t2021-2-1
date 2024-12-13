import java.util.*;

public class Problem_4 {
    public static Map<Integer, Integer> countMultiples(List<Integer> numbers) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            result.put(i, count);
        }
        return result;
    }
}
class ge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        Map<Integer, Integer> multiplesCount = Problem_4.countMultiples(numbers);

        System.out.println("Multiples count: " + multiplesCount);

        scanner.close();
    }
}
