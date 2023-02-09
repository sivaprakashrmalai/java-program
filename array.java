package arrays;

import java.util.Arrays;

public class Test4 {
    public static void main(String args[]){
    
    
    int num2[][] = {{1,2,3,4},{5,6,7,8}};
    num2[0][2] = 9;
    System.out.println(Arrays.toString(num2[0]));
    System.out.println(Arrays.toString(num2[1]));
    
    System.out.println(num2[1][2]);
    
    System.out.println(" the maximum value of array at first position in multi dimensional array: "+Math.max(num2[0][1],num2[1][1]));
    System.out.println(" the minimum value of array at first position in multidimensional array: "+Math.min(num2[0][1], num2[1][1]));
    System.out.println(" the power value of array at first position in multidimensional array: "+Math.pow(num2[0][1], num2[1][1]));
    System.out.println(" the square root value of array at first position in multidimensional array: "+Math.sqrt(num2[0][2]));

    }     
}
