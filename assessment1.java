public class Test4 {
    public static void main (String args[]){
        
    /*
     1) what are the various access specifier for java classes?
          
     Java provides four types of access specifiers. there are,
          ->public
          ->private
          ->default
          ->protected
    */

    /*
     3) what is the difference between break and continue statement? give an example program?
     
     -> the break statement stops the entire loop. once the break statement is executed ,then the loop doesnt run again.
     
     -> the continue statement stops the current iteration of the loop.
     */
    System.out.println("EXAMPLE FOR BREAK STATEMENT: ");
     for(int i=0;i<=100;i++){
       
        if(i==50){
           
            break;
         }
         System.out.println(i);
     }


     System.out.println("EXAMPLE FOR CONTINUE STATEMENT :");
     for(int i=0;i<=10;i++){
        
        if(i==5){
            
            
            System.out.println("************************");
            continue;
        }
        System.out.println(i);
     }
     
    
     /*
      4) what will be the output of following piece of code?
      public class OperatorExample {
        public static void main (String args[] ){
            int x=4;
            System.out.println(x++);

            OUTPUT:
            4
           -> because in the print statement we had to use the post increment operator.so after excution the value of x will be increase 1.
        }
      } 

     */
    

    

    
    
     /*2)what is an infinte loop? how is the infinte loop declared?
     
     An infinite loop occurs when a condition always evaluates to true.
      Usually, this is an error. For example, you might have a loop that decrements until it reaches 0.   
      declartion:
      in this method we have to use two semicoolen in condition of the for loop:
      */  
     for(;;)
     {
        
        
            System.out.println("hello");
        
     }
      

     
     
     


     }

    }     
 
