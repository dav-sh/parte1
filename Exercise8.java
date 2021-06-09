import java.util.Scanner;
public class Exercise8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int third = scanner.nextInt();
        System.out.println("Average of the three numbers: "+((first+second+third)/3));
    }
}