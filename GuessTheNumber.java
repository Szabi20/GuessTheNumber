import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int upperbound = 11;
        int int_random = rand.nextInt(upperbound);
        
        int szam2=0;
        //System.out.println(int_random);
         szam2 = scan.nextInt();
         
       
        while (int_random>szam2) {
            
             szam2 = scan.nextInt();
            System.out.println("A random szám nagyobb");
             

        }
        
        while(int_random<szam2){
             szam2 = scan.nextInt();
            System.out.println("A random szám kisebb");
        }
        if(int_random==szam2){
            
            System.out.println("talált");
        }

    }}
