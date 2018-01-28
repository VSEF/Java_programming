/**
 * Created by User on 04.01.2018.
 */
import java.util.*;
import java.io.*;
public class WordCount {
    public static void main(String [] args) throws Exception {
        File file = new File("C:/Users/User/Desktop/Test.txt");
        Scanner sc = new Scanner(file);

        int words = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            words += line.split(" ").length;
        }
        System.out.println("The file contains: " + words + " words.");
    }
}
