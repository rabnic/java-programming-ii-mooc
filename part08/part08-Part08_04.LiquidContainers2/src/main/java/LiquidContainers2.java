
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            
            // 
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            // Handle negative input
            /*if (amount < 0) {
                continue;
            }*/
            
            // Add command
            if (command.equals("add")) {
                first.add(amount);
            }
            
            // Move command
            if (command.equals("move")) {
                if (amount > first.contains()) {
                    amount = first.contains();
                    first.remove(amount);
                } else {
                    first.remove(amount);
                }
                
                second.add(amount);
            }
            
            // Remove command
            if (command.equals("remove")) {
                second.remove(amount);
            }

    }

}
    
}
