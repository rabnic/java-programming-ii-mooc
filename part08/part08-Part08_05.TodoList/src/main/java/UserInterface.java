
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class UserInterface {
    
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scanner = scan;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            
            // stop command
            if (command.equals("stop")) {
                break;
            }
            
            // add command
            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                this.list.add(task);
            }
            
            // remove command
            if (command.equals("remove")) {
                System.out.print("Which one is removed: ");
                int taskNum = Integer.valueOf(this.scanner.nextLine());
                this.list.remove(taskNum);
                
            }
            
            // list command
            if (command.equals("list")) {
                this.list.print();
            }
        }
    }
    
}
