package pro.lipeng;

import java.util.Random;

public class GuessNum {
    public static void main(String[] args) {

        int min=1;
        int max=10;


        Random random=new Random();
        int randomNumber = random.nextInt(max - min + 1) ;
        System.out.println(randomNumber);
    }
}
