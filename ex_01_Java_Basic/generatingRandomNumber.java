package ex_01_Java_Basic;

import java.util.Random;

public class generatingRandomNumber {

    public static void main(String[] args) {
        Random rand  = new Random();
        int rollnumber =rand.nextInt(6) +1;
        System.out.println(display(rollnumber));
    }

    static String display(int value){
        return"---------\n| o     |\n|   o   |\n|     o |\n---------";

    }
}
