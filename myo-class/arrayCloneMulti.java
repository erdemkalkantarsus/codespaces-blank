public class arrayCloneMulti {
      
    public static void main(String args[]) {  
        int arr[][] = { {1, 2, 3}, {4, 5, 6} };  

        int cloneArr[][] = arr.clone(); 
 
        cloneArr[0][0] = 99;  
 
        System.out.println("Orijinal Dizi: ");  
        for (int[] element : arr) {  
            for (int j = 0; j < element.length; j++) {  
                System.out.print(element[j] + " ");  
            }  
            System.out.println();  
        }  
    }  
    
}
