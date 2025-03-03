import java.io.FileInputStream;
import java.io.InputStreamReader;

public class fileStrReader {

    public static void main(String[] args) {

        char[] array = new char[100];

        try {

            // FileInputStream

            FileInputStream file = new FileInputStream("myo-class/test/new.txt");

            // InputStreamReader

            InputStreamReader input = new InputStreamReader(file);

            int data = input.read();

            while (data != -1) {

                System.out.print((char) data);

                data = input.read();

            }

            input.close();

        } catch (Exception e) {

            e.getStackTrace();

        }

    }

}