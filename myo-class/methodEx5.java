public class methodEx5 {
    
    public static int staticAdd(int a, int b) {
        return a + b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        methodEx5 m = new methodEx5();
        System.out.println("Toplam: " + m.add(5, 3));
        System.out.println("Fark: " + m.subtract(10, 4));

        System.out.println("Static Toplam: " + staticAdd(5, 3));
    }
}
