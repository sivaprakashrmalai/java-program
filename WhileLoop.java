package arrays;

public class WhileLoop {
    public static void main(String args[]){
        // while loop:
        int a=1;
        while(a<100){
            
        
        System.out.println(a);
        a++; 
        if(a==51){
            System.out.println("************");
           
        }  
        continue;     
        }

        System.out.println();
        a=0;        
        do{
            System.out.println("hello world:");
            a++;
        }
        while(a<10);
    
    }
}
