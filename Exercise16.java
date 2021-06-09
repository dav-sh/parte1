import java.util.Scanner;
public class Exercise16{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int third = scanner.nextInt();
        if (first>second && first>third){
            System.out.println("Bigger number: "+first);
        }
        
        else if (second>third && second>first){
            System.out.println("Bigger number: "+second);
        }
        
        else{
            System.out.println("Bigger number: "+third);

        }
        
    }
}