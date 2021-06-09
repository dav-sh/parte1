import java.util.Scanner;
public class Exercise14{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();
        if(first%second == 0){
            System.out.println("Is divisible");
        }else{
            System.out.println("Not is divisible");
        }
    }
}