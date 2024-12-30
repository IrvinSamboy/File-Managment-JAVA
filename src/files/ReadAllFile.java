package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllFile {
    public static void main(String[] args) {
        String fileName = "newFile.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            lines.forEach(System.out::println);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
