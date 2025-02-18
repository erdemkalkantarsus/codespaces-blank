public class nestedIfExample {
    public static void main(String[] args) {
        int yas = 20;
        int kilo = 55;

        if (yas >= 18) {  
            if (kilo >= 50) {  
                System.out.println("Kan bağışı yapabilirsiniz.");
            } else {
                System.out.println("Kilonuz düşük, kan bağışı yapamazsınız.");
            }
        } else {
            System.out.println("Yaşınız küçük, kan bağışı yapamazsınız.");
        }
    }
}

