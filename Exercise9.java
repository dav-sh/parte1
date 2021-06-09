import java.util.Scanner;
public class Exercise9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String first = scanner.nextLine();
        System.out.println("Enter the second word: ");
        String second = scanner.nextLine();
        String x = first;
        first = second;
        second = x;
        System.out.println("Word 1: "+first);
        System.out.println("Word 2: "+second);
    }
}