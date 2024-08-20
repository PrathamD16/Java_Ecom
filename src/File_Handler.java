import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class File_Handler {
    public static void main(String[] args) {

        // To create file
        // Path path = Paths.get("C:/Users/adminuser/Desktop/file.txt");
        // try {
        //     Path createdFilePath = Files.createFile(path);
        //     System.out.println("File created at path: " + createdFilePath);
        // }
        // catch(IOException e){
        //     e.printStackTrace();
        // }

        //**Create directory */
        // Path p1 = Paths.get("C:/Users/adminuser/Desktop/Test");
        // Path p2 = Paths.get("C:/Users/adminuser/Desktop/Test/Dir1/File.txt");
        // try {

        //     //Create multilevel step by step
        //     // Path d1 = Files.createDirectory(p1);
        //     // Path d2 = Files.createDirectory(p2);

        //     Path d3 = Files.createDirectories(p2);  //Single command to create multilevel directory

        // }catch(Exception e){
        //     e.printStackTrace();
        // }

        // try {

        //     byte[] bs = Files.readAllBytes(path);
        //     List<String>strings = Files.readAllLines(path);
            
        //     System.out.println("Read bytes: " + new String(bs));
        //     System.out.println("Read Lines: " + strings);

        // }catch(Exception e){
        //     e.printStackTrace();
        // }

        ArrayList<String>arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        System.out.println(arr);
        

    }
}
