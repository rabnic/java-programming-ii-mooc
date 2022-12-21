package dictionary;

public class Main {

    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();
        dictionary.add("go", "sepela");
        dictionary.add("gos", "sepelas");
        dictionary.add("goa", "sepelad");
        dictionary.add("goe", "sepelae");
        boolean wasSuccessfull = dictionary.save();

        if (wasSuccessfull) {
            System.out.println("Successfully wrote to  file");
        } else {
            System.out.println("Could not successfully write to file");
        }
    }
}
