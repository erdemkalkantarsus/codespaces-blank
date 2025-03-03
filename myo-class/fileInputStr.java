import java.io.FileInputStream;
import java.io.IOException;

public class fileInputStr {
    public static void main(String[] args) {

        try {
            FileInputStream inp = new FileInputStream("myo-class/test/new.txt");

            System.out.println("Dosyadaki veriler: ");

            int i = inp.read();

            while (i != -1) { // Byte to char 
                System.out.print((char) i); 
                i = inp.read();

            }
            inp.close();

        } catch (IOException e) {
            e.getStackTrace();

        }

    }

}
