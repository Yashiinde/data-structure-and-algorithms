public class factorial {
     public static int factoi(int num){
        
        int i=1;
        int facto=1;
        if(num<=1){
                System.out.println("1");
                
            } 
        else{  
        do{
            i++;
            facto = i*facto;
            
        }while(i<num); 
        System.out.println(facto);
        
        }
        return 0;
     }
    public static void main(String[] args) {
        int num=3;
        factoi(5);
    }
    
}
