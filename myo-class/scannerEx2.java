import java.util.Scanner; 

public class scannerEx2 {
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in); 
      System.out.println("Enter smt.");

      System.out.println(s.nextLine() + 5);
      System.out.println(Integer.parseInt(s.nextLine()) + 5);
    
  }
}
