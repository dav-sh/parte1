import java.util.Scanner;
public class Exercise1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();
        int sum = first + second;
        System.out.println("Sum result: "+sum);
    }
}