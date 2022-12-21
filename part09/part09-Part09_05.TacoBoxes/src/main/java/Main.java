
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox triple = new TripleTacoBox();
        System.out.println(triple.tacosRemaining());
        triple.eat();
        System.out.println(triple.tacosRemaining());
        triple.eat();
        System.out.println(triple.tacosRemaining());
        triple.eat();
        System.out.println(triple.tacosRemaining());
        triple.eat();
        System.out.println(triple.tacosRemaining());
        triple.eat();
        System.out.println(triple.tacosRemaining());
        triple.eat();
        System.out.println(triple.tacosRemaining());
        triple.eat();
        System.out.println(triple.tacosRemaining());
        triple.eat();
        // CustomTacoBox
        System.out.println("--------------------------------------------");
        
        CustomTacoBox custom = new CustomTacoBox(15);
        System.out.println(custom.tacosRemaining());
        custom.eat();
        System.out.println(custom.tacosRemaining());
        custom.eat();
        System.out.println(custom.tacosRemaining());
        custom.eat();
        System.out.println(custom.tacosRemaining());
        custom.eat();
        System.out.println(custom.tacosRemaining());
        custom.eat();
        System.out.println(custom.tacosRemaining());
        custom.eat();
        System.out.println(custom.tacosRemaining());
        custom.eat();
        System.out.println(custom.tacosRemaining());
        custom.eat();
    }
}
