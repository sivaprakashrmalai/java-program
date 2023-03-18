public class Overload {
    public static void main(String args[]){
        int f=addNumber(5,10);
        System.out.println(f);

        int g=addNumber(5,10,15);
        System.out.println("g");
    }
    private static int addNumber(int a,int b){
        int d=a+b;
        System.out.println(d); 
        return d;
        //System.out.println(d);
    }
    private static int addNumber(int a,int b,int c){
        int e=a+b+c;
        System.out.println(e); 
        return e;
       //System.out.println(e); S
    }    


    }
    
