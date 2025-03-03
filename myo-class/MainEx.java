
public class MainEx {

     public static void main(String[] args) { 

          try {

               Student s = Student.find(12);
               System.out.println("ID : " + s.getId());
               System.out.println("Name : " + s.getName());

          } catch (StudentException e) {

               System.out.println(e.getMessage());

          }

     }

}
