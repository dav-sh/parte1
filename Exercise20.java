import java.util.Scanner;
public class Exercise20{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number,d1,d2,d3,d4,d5;
        double r5,r3,r4;
        do{
            System.out.println("Enter the number: ");
            number = scanner.nextInt();
        }while(number>99999 && number<=0);
        if(number<=9){
            number = number/1;
            d5 = number;
            d4=0;
            d3=0;
            d2=0;
            d1=0;
        }
        else if(number<=99){
            number = number/1;
            d5 = number/10;
            d4 = number - d5*10;
            d2=0;
            d1=0;
            d3 = 0;
        }
        else if(number<=999){
            number = number/1;
            d5 = number/100;
            r5 = number - d5*100;
            d4 = (int)(r5/10);
            d3 = (int)(r5 - d4*10);
            d2=0;
            d1=0;

        }
        else if(number<=9999){
            d5 = number/1000;
            r5 = number - d5*1000;
            d4 = (int)(r5 / 100);
            r4 = r5 - d4*100;
            d3 = (int)(r4/10);
            r3 = r4 - d3*10; 
            d2 = (int)(r3 /1);
            d1 = 0;
            
        }else{
            d5 = number/10000;
            r5 = number - d5*10000;
            d4 = (int)(r5 / 1000);
            r4 = r5 - d4*1000;
            d3 = (int)(r4/100);
            r3 = r4 - d3*100; 
            d2 = (int)(r3 /10);
            d1 = (int)(r3 - d2*10);
            
        }
        int ordererNumber = d1*10000 + d2*1000+d3*100+d4*10+d5*1;
        System.out.println("x: " + ordererNumber);
        System.out.println("y: "+number);
        if(ordererNumber==number){
            System.out.println("It's capicua");
        }else{
            System.out.println("It's not capicua");
        }
    }
}