import java.io.File;
import java.io.IOException;

public class fileCreate {
    public static void main(String[] args) {
        File file = new File("myo-class/test/new.txt");
        try {
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("Yeni Dosya Oluştu.");
            } else {
                System.out.println("Dosya Zaten Mevcut.");
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
