import java.io.FileInputStream;

public class availableBytes {
    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("myo-class/test/new.txt");

            // Kullanılabilir bayt sayısını verir 
            
            System.out.println("Kullanılabilir bayt sayısı : " + input.available());
 
            input.read();

            input.read();

            input.read();

            // Kullanılabilir bayt sayısını verir 
            
            System.out.println("Kullanılabilir bayt sayısı : " + input.available());

            input.close();

        } catch (Exception e) {
            e.getStackTrace();

        }

    }

}
