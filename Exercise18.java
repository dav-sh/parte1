import java.util.Scanner;
public class Exercise18{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        String d1,d2,d3,d4;
        do{
            System.out.println("Enter the number: ");
            number = scanner.nextInt();
        }while(number>=9999 && number<=0);
        if(number<=9){
            number = number/1;
            d1="0";
            d2="0";
            d3="0";
            d4=String.valueOf(number);

        }
        else if(number<=99){
            number = number/1;
            d1 = "0";
            d2="0";
            d3 = String.valueOf(number).substring(0,1);
            d4 = String.valueOf(number).substring(1,2);

        }
        else if(number<=999){
            number = number/1;
            d1 = "0";
            d2 = String.valueOf(number).substring(0,1);
            d3 = String.valueOf(number).substring(1,2);
            d4 = String.valueOf(number).substring(2,3);

        }else{
            number = number/1;
            d1 = String.valueOf(number).substring(0,1);
            d2 = String.valueOf(number).substring(1,2);
            d3 = String.valueOf(number).substring(2,3);
            d4 = String.valueOf(number).substring(3,4);

        }
        int sum = Integer.parseInt(d1) + Integer.parseInt(d2) + Integer.parseInt(d3) + Integer.parseInt(d4);
        System.out.println("d1: "+d1+"  d2: "+d2+"  d3: "+d3+"  d4: "+d4+"  sum: "+sum);
    }
}