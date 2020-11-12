package ArrayPractice;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

   // find average number

        Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers would you like to enter?");
        int length = scan.nextInt();

        int[] numbers = new int[length];
        int sum = 0;

        for (int i =0;i<length;i++){
            System.out.println("enter a number");
             numbers[i]=scan.nextInt();
             sum+=numbers[i];
        }

        double average = (double)sum /length;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);



    }
}
