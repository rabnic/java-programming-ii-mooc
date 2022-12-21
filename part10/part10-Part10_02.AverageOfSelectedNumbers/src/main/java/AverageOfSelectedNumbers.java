
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nums = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            nums.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        double avg = 0;
        if (input.equals("n")) {
            avg = nums.stream()
                    .mapToInt(num -> Integer.valueOf(num))
                    .filter(num -> num < 0)
                    .average()
                    .getAsDouble();
        } else if (input.equals("p")) {
            avg = nums.stream()
                    .mapToInt(num -> Integer.valueOf(num))
                    .filter(num -> num > 0)
                    .average()
                    .getAsDouble();
        } 
        
        String side = input.equals("n")? "negative": "positive";
        
        System.out.println("Average of the" + side + "numbers: " + avg);

    }
}
