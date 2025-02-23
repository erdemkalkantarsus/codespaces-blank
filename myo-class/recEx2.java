public class recEx2 {

        public static int sumBetween(int start, int end) {
            if (end < start) { 
                return 0;
            }
            return end + sumBetween(start, end - 1);
        }
    
        public static void main(String[] args) {
            int result = sumBetween(1, 5);
            System.out.println("1 ile 5 arasındaki sayıların toplamı: " + result);
        }

        /* 
        sumBetween(1, 5) = 5 + sumBetween(1, 4)
        sumBetween(1, 4) = 4 + sumBetween(1, 3)
        sumBetween(1, 3) = 3 + sumBetween(1, 2)
        sumBetween(1, 2) = 2 + sumBetween(1, 1)
        sumBetween(1, 1) = 1 + sumBetween(1, 0)
        sumBetween(1, 0) = 0 (Durdurma koşulu tetiklendi)
        */
   
}
