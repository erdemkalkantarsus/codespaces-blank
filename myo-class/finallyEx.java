import java.util.Scanner;

public class finallyEx {

    Scanner scanner = new Scanner(System.in);
    
    public int readIntFromKeyboard() {
        
        try {
        
            String inputFromKeyboard = scanner.nextLine();
            int number = Integer.parseInt(inputFromKeyboard);
            return number;
        
        } catch (NumberFormatException e) {
        
            System.err.println(e);
        
        } finally {
            System.out.println("here it was");
            scanner.close();
        }

        return -1;
 
    }

    public static void main(String[] args) {
        finallyEx f = new finallyEx();
        int i = f.readIntFromKeyboard();
        System.out.println(i);
    }
}

