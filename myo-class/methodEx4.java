class Test {

    public static int i = 0;

    Test() {
        i++;
    }

    public static int get() {
        return i;
    }

    public int m1() {
        System.out.println("Inside the method m1");
        this.m2();  // Calling m2 method
        return 1;
    }

    public void m2() {
        System.out.println("In method m2");
    }
}

// Main class
public class methodEx4 {

    public static void main(String[] args) {

        Test obj = new Test();

        int i = obj.m1();
        System.out.println("Control returned after m1: " + i);

        int o = Test.get();
        System.out.println("No of instances created: " + o);
    }
}
