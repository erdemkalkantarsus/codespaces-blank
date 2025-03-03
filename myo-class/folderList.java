import java.io.File;

public class folderList {
    public static void main(String[] args) {
        File file = new File("myo-class/test");
        String[] fileList = file.list();
        for (String str : fileList) {
            System.out.println(str);
        }
    }
}
