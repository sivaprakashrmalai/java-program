package day1;

public class Operator {
    public static void main(String args[]){

    
    /*   logical operator
            and(&&)
            or(||)
            not(!)

    */

    int num1 = 19;

    if( num1>=18 && 20>=num1){
      //  System.out.println("fresher vote:");
    }
    else if(num1>18){
        System.out.println("elder vote:");
    }
    else{
        System.out.println("you are not eligible to vote:");
    }
}
}
