
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;
            
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, age));
            
            //System.out.println();
        }
        //System.out.println();
        System.out.println(books.size() + " books in total.");
        System.out.println();
        System.out.println("Books:");
        System.out.println();
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        
        books.stream()
                .forEach(book -> System.out.println(book));
        

    }

}
