import java.io.File;

public class folderCreate {
    public static void main(String[] args) {
        File file = new File("myo-class/test");
        boolean value = file.mkdir();
        if (value) {
            System.out.println("The new directory is created.");
        } else {
            System.out.println("The directory already exists.");
        }
    }
}
