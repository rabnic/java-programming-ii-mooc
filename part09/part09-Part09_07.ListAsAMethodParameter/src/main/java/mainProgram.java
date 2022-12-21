
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<String> dogs = new ArrayList();
        dogs.add("Scotch");
        dogs.add("Skippy");
        
        List<String> cars = new LinkedList();
        cars.add("BMW");
        cars.add("VW");
        cars.add("Audi");
        
        System.out.println("ArrayList: " + returnSize(dogs));
        System.out.println("LinkedList: " + returnSize(cars));
        

    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    
    public static int returnSize(List list) {
        return list.size();
    }
}
