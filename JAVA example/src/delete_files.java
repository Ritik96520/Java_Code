import java.io.File;

public class delete_files {

    public static void main(String[] args) {
        File file = new File("Ritik.txt");
        boolean delete = file.delete();
        System.out.println("File deleted = " + delete);
    }
}

