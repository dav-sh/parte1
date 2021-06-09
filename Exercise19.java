import java.util.Random;
public class Exercise19{
    public static void main(String[] args){
        Random r = new Random();
        int rnd;
        do{
            rnd = r.nextInt(1000 - 1+1 )+1;
            System.out.println("x: "+rnd);
        }while(rnd%5 !=0 && rnd>125);
        System.out.println("Random number: "+rnd);
        System.out.println("Correct");
    }
}