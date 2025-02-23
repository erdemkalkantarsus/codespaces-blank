import java.util.Scanner; 

class scannerEx1 {
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in); 
      System.out.println("Enter username");
    
      String userName = s.nextLine(); 
      System.out.println("Username is: " + userName);
    
  }
}