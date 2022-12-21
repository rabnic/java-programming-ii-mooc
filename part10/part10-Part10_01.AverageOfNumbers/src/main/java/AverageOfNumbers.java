
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nums = new ArrayList<>();
        // Write your program here
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            nums.add(input);
        }
        double avg = nums.stream()
                .mapToInt(num -> Integer.valueOf(num))
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: " + avg);
        

    }
}
