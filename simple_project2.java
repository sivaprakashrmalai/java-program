import java.util.Scanner;
public class SimpleBankCreate{
    public static void main(String args[]){
      CreateBankFeature obj1 = new CreateBankFeature();
      obj1.mainSource();
    }
}

class CreateBankFeature{
    int balance;
    int previous_transaction;
    Scanner obj = new Scanner(System.in);
    int amount1;
    int amount2;
    int account_no;
    int pin;
    int pin1;

    public void deposit(){
        System.out.println("===============================================================================================");
        System.out.println(" ENTER YOUR DEPOSIT AMOUNT:");
        amount1=obj.nextInt();
        balance = balance+amount1;
        previous_transaction = amount1;
        System.out.println("you have successfully deposited");
        System.out.println("===============================================================================================");
        System.out.println("\n");
    }
    public void withdraw(){
        System.out.println("===============================================================================================");
        System.out.println(" ENTER YOUR WITHDRAW AMOUNT:");
        amount2=obj.nextInt();
        balance = balance-amount2;
        previous_transaction = amount2;
        System.out.println("you have successfully withdrawn");
        System.out.println("===============================================================================================");
        System.out.println("\n");
    }
    public void previous_transaction(){
        System.out.println("===============================================================================================");
      if(balance == balance){
        System.out.println(" your previous transaction is: "+previous_transaction);
      }
      else{
        System.out.println("transaction is not occured: ");
      }
        
        System.out.println("===============================================================================================");
        System.out.println("\n");
    }
    public void checkbalance(){
      System.out.println("===============================================================================");
        System.out.println("your balance amount is:"+balance);
        System.out.println("===============================================================================");
          System.out.println("\n");
    }
    public void mainSource(){
      String user_name;
      int id;
      System.out.println("Enter your user name:");
      user_name=obj.nextLine();
      System.out.println("Enter your ID:");
      id=obj.nextInt();
      System.out.println("\n");
      System.out.println("===============================================================================");
       System.out.println("Enter your A/C no: ");
      for(int i=0;i<12;i++){
         account_no=obj.nextInt();
              }
        System.out.println("enter your pin number:");
      for(int i=0; i<4;i++){
          pin=obj.nextInt();
      }  
                
      System.out.println("=================================================================");
      System.out.println("\n");
      System.out.println("your user name is: "+user_name);
      System.out.println("your id is: " +id );
      System.out.println("======================================================================");
      System.out.println("\n");
      System.out.println("WELCOME SIR...!!");
      System.out.println("option1: deposit");
      System.out.println("option2: withdraw");
      System.out.println("option3: checkbalance");
      System.out.println("option4: previous_transaction");
      System.out.println("option5: EXIT");
      System.out.println("\n");
      System.out.println("================================================================");
      
      int option;
      
      do{
        System.out.println("enter your choice: ");
        option=obj.nextInt();
      System.out.println("===================================================================");
      System.out.println("enter your pin number:");
      for(int i=0; i<4;i++){
          
              pin1=obj.nextInt();
          
      }            
      System.out.println("=================================================================");
      System.out.println("\n");
     
      if( pin == pin1){
        
          switch(option){
            case 1:
                  deposit();
                  break;
            case 2:
                  withdraw();
                  break;
            case 3:
                  checkbalance();
                  break;
            case 4:
                  previous_transaction();
                  break;
            case 5:
                  System.out.println("thank you for your woderful service sir.......!!!");
                  break;
            
            default:
                  System.out.println("pls enter the correct option:");
                  break;
                    
          }
        }
        else{
          System.out.println("please enter your correct pin number:");
        }


     
    
    }while(option != 5 );
    
}

}


