
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        List<String> fileString = new ArrayList<>();
        // test the method here

    }
    
    public static List<String> read(String file){
        List<String> fileString = null;
        try {
            fileString = Files.lines(Paths.get(file))
                .collect(Collectors.toCollection(ArrayList::new));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return fileString;
    }

}
