package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class newFile {
    public static void main(String[] args) {
        String fileName = "newFile.txt";
        File file = new File(fileName);

        try{
            if(file.exists()){
                System.out.println("File already exists");
            }
            else {
                PrintWriter out = new PrintWriter(new FileWriter(file));
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
