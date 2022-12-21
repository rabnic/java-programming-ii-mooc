
public class Main {

    public static void main(String[] args) {
        // test your classes here
        
    Box box = new Box(10);
    Box box1 = new Box(12);
    Box mainBox = new Box(25);
    Box largeBox = new Box(100);

    box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
    box.add(new Book("Robert Martin", "Clean Code", 1));
    box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

    box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
    box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
    box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
    
    box1.add(new Book(" Dostoevsky", "Crime and Punishment", 2.1)) ;
    box1.add(new Book(" Martin", "Clean Code", 1.1));
    box1.add(new Book(" Beck", "Test Driven Development", 1.7));

    box1.add(new CD(" Floyd", "Dark Side of the Moon", 1973));
    box1.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
    box1.add(new CD("Rendezvous ", "Closer to Being Here", 2021));
    
    mainBox.add(box1);
    mainBox.add(box);
    largeBox.add(mainBox);

    System.out.println(mainBox);
    System.out.println(largeBox);

    }

}
