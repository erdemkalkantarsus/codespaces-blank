public class Person {

    private int age;

    public void setAge(int age) throws IllegalArgumentException {

        if (age < 0) {
            throw new IllegalArgumentException("Yaş sıfırdan küçük olamaz!");
        }

        this.age = age;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-1);
    }

}
