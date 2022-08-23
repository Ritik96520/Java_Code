import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String[] args) throws IOException {

        File myFile = new File("Ritik.txt");

        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        }  catch (IOException e) {
            System.out.println("Not created file");
            e.printStackTrace();
        }
    }
}
