import java.util.Scanner;
public class Exercise17{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second side: ");
        int second = scanner.nextInt();
        System.out.println("Enter the third side: ");
        int third = scanner.nextInt();
        if(first==second && third==first){
            System.out.println("Equilateral");
        }
        else if(first==second || third==first || third==second){
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene");
        }
    }
}