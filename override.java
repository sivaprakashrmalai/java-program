public class Override1 {
    public static void main(String args[]){
        Bank a1=new Bank();
        IOB a2=new IOB();
        Unionbank a3=new Unionbank();
        System.out.println(a1.getinterest());
        
        System.out.println(a2.getinterest());
        
        System.out.println(a3.getinterest());
    }
}
class Bank {
    
    int getinterest(){
        return 0;
    }
} 
class IOB extends Bank{
    
    int getinterest(){
        return 5;
    }
}
class Unionbank extends Bank{
    
    int getinterest(){
        return 8;
    }
}
