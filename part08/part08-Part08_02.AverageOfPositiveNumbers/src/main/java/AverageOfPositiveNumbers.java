
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPositives = 0;
        int sumOfPositives = 0;
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            
            if (input < 0) {
                continue;
            }
            sumOfPositives += input;
            numOfPositives++;
        }
        
        if (numOfPositives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * sumOfPositives / numOfPositives);
        }

    }
}
