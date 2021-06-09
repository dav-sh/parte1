import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the country: ");
        String country = scanner.nextLine();
        System.out.println("Enter the capital: ");
        String capital = scanner.nextLine();
        System.out.println(capital+" is the capital of "+country);
    }
}