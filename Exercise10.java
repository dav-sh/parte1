import java.util.Scanner;
public class Exercise10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = scanner.nextInt();
        System.out.println("Enter the height: ");
        int height = scanner.nextInt();
        System.out.println("The area of the square/rectangle is: "+(base*height));
    }
}