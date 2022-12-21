
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // While the input is not end print ots cube
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            
            System.out.println(cube(Integer.valueOf(input)));
        }
        

    }
    
    private static int cube(int num) {
        return num * num * num;
    }
}
