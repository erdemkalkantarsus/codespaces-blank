public class methodEx6 {
        
        public int add(int a, int b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }
    
        public double add(double a, double b) {
            return a + b;
        }

        public String add(String a, String b) {
            return a + b;
        }
    
        public static void main(String[] args) {
            methodEx6 m = new methodEx6();
            System.out.println("Toplam: " + m.add(5,  3));
            System.out.println("Toplam: " + m.add(5,  3, 4));
            System.out.println("Toplam: " + m.add(5.3, 3.2));
            System.out.println("Toplam: " + m.add(5, 3.2));
            System.out.println("Toplam: " + m.add("5", "3.2"));
        }

}
