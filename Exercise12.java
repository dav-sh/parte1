import java.util.Scanner;
public class Exercise12{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double temperature = scanner.nextDouble();
        System.out.println("Temperature in Fahrenheit: "+(temperature*1.8 + 32));
    }
}