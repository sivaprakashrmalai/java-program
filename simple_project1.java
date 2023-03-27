import java.util.Scanner;

public class Unitconvert {
    public static void main(String args[]){
        Conversion obj1 = new Conversion();
        obj1.mainSource();
    }
}

class Conversion{
    Scanner obj = new  Scanner(System.in);
    Double val1;
    Double val2;
     public void cmToMeter(){
        System.out.println("enter the value of centi_metre:");
       val1= obj.nextDouble();
       System.out.println("\n");
       System.out.println("================================================================================================");
        val2 = val1/100;
        System.out.println(val2+" meter");
        System.out.println("================================================================================================");
        System.out.println("\n");
     }
     public void meterToKilomtr(){
        System.out.println("enter the value of meter:");
       val1= obj.nextDouble();
       System.out.println("\n");
       System.out.println("================================================================================================");
        val2 = val1/1000;
        System.out.println(val2+" kilometer");
        System.out.println("================================================================================================");
        System.out.println("\n");
     }
     public void kiloToMeter (){
        System.out.println("enter the value of kilometer:");
       val1= obj.nextDouble();
       System.out.println("\n");
       System.out.println("================================================================================================");
        val2 = val1*1000;
        System.out.println(val2+ " metre");
        System.out.println("================================================================================================");
        System.out.println("\n");
     }
     public void mlTolitre(){
        System.out.println("enter the value of millilitre:");
       val1= obj.nextDouble();
       System.out.println("\n");
       System.out.println("================================================================================================");
        val2 = val1/1000;
        System.out.println(val2+" litre");
        System.out.println("================================================================================================");
        System.out.println("\n");
     }
     public void mmToCm(){
        System.out.println("enter the value of millimetre:");
       val1= obj.nextDouble();
       System.out.println("\n");
       System.out.println("================================================================================================");
        val2 = val1/10;
        System.out.println(val2+" centimetre");
        System.out.println("================================================================================================");
        System.out.println("\n");
     }
     public void inchToFeet(){
        System.out.println("enter the value of inch:");
       val1= obj.nextDouble();
       System.out.println("\n");
       System.out.println("================================================================================================");
        val2 = val1/12;
        System.out.println(val2+" feet");
        System.out.println("================================================================================================");
        System.out.println("\n");
     }
     public void footTocm(){
        System.out.println("enter the value of foot:");
       val1= obj.nextDouble();
       System.out.println("\n");
       System.out.println("================================================================================================");
        val2 = val1/30.48;
        System.out.println(val2+" centimetre");
        System.out.println("================================================================================================");
        System.out.println("\n");
     }
     public void meterTocm(){
        System.out.println("enter the value of metre:");
       val1= obj.nextDouble();
       System.out.println("\n");
       System.out.println("================================================================================================");
        val2 = val1*100;
        System.out.println(val2+" centi_metre");
        System.out.println("================================================================================================");
        System.out.println("\n");
     }
     public void mgramToGram(){
        System.out.println("enter the value of milligram:");
       val1= obj.nextDouble();
       System.out.println("\n");
       System.out.println("================================================================================================");
        val2 = val1/1000;
        System.out.println(val2+" gram");
        System.out.println("================================================================================================");
        System.out.println("\n");
     }
     public void gramToKiloGram(){
        System.out.println("enter the value of gram");
       val1= obj.nextDouble();
       System.out.println("\n");
       System.out.println("================================================================================================");
        val2 = val1/1000;
        System.out.println(val2+" kilogram");
        System.out.println("================================================================================================");
        System.out.println("\n");
     }
     public void kmToCm(){
        System.out.println("enter the value of kilometre");
       val1= obj.nextDouble();
       System.out.println("\n");
       System.out.println("================================================================================================");
        val2 = val1*100000;
        System.out.println(val2+" centimetre");
        System.out.println("================================================================================================");
        System.out.println("\n");
     }

     public void mainSource(){
        System.out.println("============================================================================================");
        System.out.println(".....Hell Welcome Sir......!!");
        System.out.println("option 1: centimeter-to-meter");
        System.out.println("option 2: meter-to-kilometer");
        System.out.println("option 3: kilometer-to-meter");
        System.out.println("option 4: milliliter-to-liter");
        System.out.println("option 5: millimeter-to-centimeter");
        System.out.println("option 6: inch-to-feet");
        System.out.println("option 7: feet-to-centimeter");
        System.out.println("option 8: meter-to-centimeter");
        System.out.println("option 9: milligram-to-gram");
        System.out.println("option 10: gram-to-kilogram");
        System.out.println("option 11: kilometer-to-centimeter");
        System.out.println("option 12: EXIT");
        System.out.println("\n");

        int choice ;
       
        do{
            System.out.println("enter your choice:");
            choice=obj.nextInt();
            System.out.println("\n");

            switch(choice){
                case 1:
                    cmToMeter();
                    break;
                case 2:
                    meterToKilomtr();
                    break;
                case 3:
                    kiloToMeter();
                    break;
                case 4:
                    mlTolitre();
                    break;
                case 5:
                    mmToCm();
                    break;
                case 6:
                    inchToFeet();
                    break;
                case 7:
                    footTocm();
                    break;
                case 8:
                    meterTocm();
                    break;
                case 9:
                    gramToKiloGram();
                    break;
                case 10:
                    cmToMeter();
                    break;
                case 11:
                    kmToCm();
                    break;
                case 12:
                    System.out.println("thank you for your service:");
                    break;
                default:
                System.out.println("please enter the correct option:");
                break;    
            }
        }while(choice != 12);

        
        
        
    


}

}
