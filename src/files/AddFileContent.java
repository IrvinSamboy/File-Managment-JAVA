package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AddFileContent {
    public static void main(String[] args) {
        boolean append = false;
        String fileName = "newFile.txt";
        File file = new File(fileName);

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(file));
            writer.println("Hello from the system");
            writer.println("Bye from the system");
            writer.close();
            System.out.println("Content added correctly");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
