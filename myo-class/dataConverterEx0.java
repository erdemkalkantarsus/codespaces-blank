
public class dataConverterEx0 {

    public int convertToInt(String numberAsText) {
    
    
        try { 
            int number = Integer.parseInt(numberAsText);
            return number; 
        } catch (NumberFormatException | NullPointerException e) { 
            System.out.println(e);
        }
        
        return -1; 

    }

    public static void main(String[] args) {
        dataConverterEx0 d = new dataConverterEx0();
        int i = d.convertToInt("5,4");
        System.out.println(i);
    }

}
    
