public class Student {

     private int id;
     private String name;

     public Student(int id, String name) {
          this.id = id;
          this.name = name;
     }

     public static Student find(int id) throws StudentException {
          if (id == 123) {
               return new Student(123, "ibrahim erdem");
          } else {
               throw new StudentException("Öğrenci Bulunamadı");
          }
     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

}
