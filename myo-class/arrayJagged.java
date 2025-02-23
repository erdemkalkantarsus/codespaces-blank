public class arrayJagged {
     
        public static void main(String[] args){  
            
            int arr[][] = new int[3][];  
            arr[0] = new int[3];  
            arr[1] = new int[4];  
            arr[2] = new int[2];  
              
            int count = 0;  
            for (int[] element : arr) {
                for(int i=0; i<element.length; i++) {
                    element[i] = count++;
                }
            } 
                 
            for (int[] element : arr) {  
                for (int j=0; j<element.length; j++){  
                    System.out.print(element[j]+" ");  
                }  
                System.out.println();  
            }  
        }  
    
}
