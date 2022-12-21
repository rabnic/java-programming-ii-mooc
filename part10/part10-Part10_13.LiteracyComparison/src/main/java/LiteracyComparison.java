
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<LiteracyData> data = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(LiteracyComparison::sanitizeInput)
                    .forEach(newData -> data.add(newData));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        data.stream().sorted().forEach(item -> System.out.println(item));

    }
    public static LiteracyData sanitizeInput(String input) {
        String[] splitted = input.split(",");
        String country = splitted[3];
        int year = Integer.valueOf(splitted[4]);
        String gender = splitted[2].trim().split(" ")[0];
        double rate = Double.valueOf(splitted[5]);
        
        return new LiteracyData(country, year, gender, rate);
    }
}
