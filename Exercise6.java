import java.util.Random;
public class Exercise6{
    public static void main(String[] args){
        Random rand = new Random();
        int upperbound = 201;
        int rnd = rand.nextInt(upperbound);
        System.out.println("Random number: "+rnd);
        System.out.println("Number + 30%: "+(rnd+0.3*rnd));
    }
}