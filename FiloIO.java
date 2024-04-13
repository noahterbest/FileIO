import java.io.*;
import java.util.*;
public class FiloIO {
    public static void main(String[] args) {

        try {
            File datbase = new File("C:\\Users\\noaht\\Desktop\\database.txt");
            Scanner myReader = new Scanner(datbase);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
        }

    }

}
