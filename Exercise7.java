import java.util.Random;
public class Exercise7{
    public static void main(String[] args){
        Random r = new Random();
        int rnd = r.nextInt(50-11)+10;
        System.out.println("Random number: " + rnd);
        System.out.println("Number + 15%: "+(rnd+0.15*rnd));
    }
}