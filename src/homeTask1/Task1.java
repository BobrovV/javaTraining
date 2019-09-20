package homeTask1;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        //1. Say Hi to user after entering his name via console
/*        System.out.println("Please enter your name: ");
        String s = new Scanner(System.in).nextLine();
        System.out.println("Hi " + s);*/

        //2. Get data from console, reverse it and return
        /*System.out.println("Please enter several symbols: ");
        String v = new Scanner(System.in).nextLine();
        char[] arrayA = v.toCharArray();
        char[] reversed = new char[arrayA.length];
        int j = 0;
        for (int i = arrayA.length; i > 0; i--) {
            reversed[j] = arrayA[i-1];
            j++;
        }
        System.out.println(reversed);*/

        //3. Output specified random numbers.
        int a = 10; //change for any int value
        for (int i = 0; i < a; i++) {
            System.out.println(new Random().nextInt());
        }


    }
}
