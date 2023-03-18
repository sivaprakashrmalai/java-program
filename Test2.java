package arrays;
import java.util.Arrays;
public class Test2 {
    public static void main(String args[]){
        String []indianPlayer = {"DHONI","VIRAT","ROHIT","JADEJA","RUTHURAJ","UTHAPPA","DINESH","DEEPAK","MUKESH","BUMHRA","BUVANESHWAR","CHAHAL","ASHWIN"};
        
        for(int i = 0; i<=6; i++){
            System.out.println();
            System.out.println(indianPlayer[i] + " is indian batsman : "  );
            
        }
        for(int i = 7; i <= 12; i++ ){
            System.out.println();
            System.out.println(indianPlayer[i] + " is indian bowler : ");
            
            
        }
        System.out.println();
        System.out.println(indianPlayer[0] + " is the best keeper in the world: " );
        System.out.println();
        System.out.println("the indian cricket players are: ");

        System.out.println("******************************************");
        
        System.out.println(Arrays.toString(indianPlayer));
        System.out.println();
    
    } 

}
