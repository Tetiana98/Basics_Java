package homework3;

import java.util.Random;

public class Lesson3 {
    public static void main(String[] args) {
        //Task#1
        int[] cat = new int[20];
        Random n=new Random();
           for (int i = 0; i< cat.length; i++) {
            cat[i]=n.nextInt(100);
            if (cat[i] !=0)
            System.out.println(cat[i]);
        }

        //Task#2
          int sum = 0;
        for (int i = 0; i < cat.length; i++) {
            if (cat[i] > 5 && cat[i] < 45) {
                sum += cat[i];
            }
        }
        System.out.println("Total : " + sum);

       //Task#3
        for (int i = 0; i < cat.length; i++) {
            if (cat[i]%2==0) {
                if (cat[i] !=0)
                System.out.println(cat[i]);
            }
        }
    }
}


