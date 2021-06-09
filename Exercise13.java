import java.util.Scanner;
import java.lang.Math.*;
public class Exercise13{
    public static void main(String[] args){
        double radius,height;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter the cylinder radius: ");
            radius = scanner.nextDouble();
        }while(radius<0);
        do{
            System.out.println("Enter the cylinder height: ");
            height = scanner.nextDouble();
        }while(height<0);
        System.out.println("The cylinder volume: "+(height*Math.PI*radius*radius));


    }
}