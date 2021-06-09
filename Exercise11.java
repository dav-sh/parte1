import java.util.Scanner;
public class Exercise11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter centimeters: ");
        float cent = scanner.nextFloat();
        System.out.println("centimeters: "+cent);
        System.out.println("centimeters to yards: "+(cent/91));
        System.out.println("centimeters to meters: "+(cent/100));
        System.out.println("centimeters to feet: "+(cent/30.48));
        System.out.println("centimeters to inches: "+(cent/2.54));
    }
}