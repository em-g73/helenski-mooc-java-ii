
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .sorted((pieces1, pieces2) -> pieces1[5].compareTo(pieces2[5]))
                    .forEach(pieces -> System.out.println(pieces[3] +  " (" + pieces[4] + "), " + pieces[2].split(" ")[1] + ", " + pieces[5]));
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
