import java.lang.Math;
import java.util.Scanner;
public class Exercise4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        double squared = Math.pow(number, 2);
        double cubed = Math.pow(number, 3);
        System.out.println("The number raised 2 power is: "+squared);
        System.out.println("The number raised 3 power is: "+cubed);
    }
}