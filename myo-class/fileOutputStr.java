import java.io.FileOutputStream;

public class fileOutputStr {
    public static void main(String[] args) {
        String data = "\nHello Java!!";
        try {
            FileOutputStream output = new FileOutputStream("output.txt", true);
            byte[] array = data.getBytes();
            output.write(array);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
