import java.util.Scanner;
public class Exercise3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int doubles = 2*number;
        int triple = 3*number;
        System.out.println("The double is: "+ doubles);
        System.out.println("The triple is: "+ triple);
    }
}