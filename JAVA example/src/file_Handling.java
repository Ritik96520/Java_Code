import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;



public class file_Handling {
    public static void main(String[] args) throws IOException {
        try { // Create file
            /*File myFile = new File("Ritik.txt");
            myFile.createNewFile();
            System.out.println("File created successfully.");*/
            // write in the file
            FileWriter myWriter = new FileWriter("Ritik.txt");
            myWriter.write("File handling in java");
            //myWriter.write("\n66");
            System.out.println("Successfully write the file.");
            myWriter.close();
            // Read the created file
            File fg = new File("Ritik.txt");
            Scanner myReader = new Scanner(fg);
            myReader.hasNextLine();
                String data = myReader.nextLine();
                System.out.println(data);
            //data = myReader.nextLine();
           // System.out.println(data);
            myReader.close();
        }  catch (IOException e) {
            System.out.println("An error occurred." + e);
            //e.printStackTrace();
        }
    }
}