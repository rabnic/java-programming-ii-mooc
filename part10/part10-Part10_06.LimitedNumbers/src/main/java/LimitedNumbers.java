
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }
            nums.add(input);
        }
        nums.stream()
                .filter(num -> num > 0 && num <= 5)
                .forEach(num -> System.out.println(num));

    }
}
