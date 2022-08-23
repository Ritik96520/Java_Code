import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_file {
    public static void main(String[] args) {
        try {
            File myObj = new File("Ritik.txt");
            Scanner myReader = new Scanner(myObj);
            myReader.hasNextLine();
                String data = myReader.nextLine();
                System.out.println(data);
                myReader.close();
            System.out.println("Read  successfully");

        } catch (Exception e) {
            System.out.println(" error occurred." + e);

        }
    }
}