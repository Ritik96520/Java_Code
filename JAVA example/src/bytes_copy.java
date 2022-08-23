import java.io.File;
import java.io.IOException;
public class bytes_copy {

    public static void main(String[] args) throws InterruptedException, IOException {
        File source = new File("Ritik.txt");
        File dest = new File("Ritik.txt");

        //copy file  using Stream
        long start = System.nanoTime();
        copyFileUsingStream(source, dest);
        System.out.println(" taken by bytesStream  = " + (System.nanoTime() - start));
    }
    private static void copyFileUsingStream(File source, File dest) {
    }
}
