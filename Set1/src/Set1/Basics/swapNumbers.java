package Set1.Basics;

import java.util.Scanner;

public class swapNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Numbers before swapping are: "+num1+" "+num2);
        swap(num1, num2);
    }

    static void swap(int num1, int num2){
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Numbers after swapping are: "+num1+" "+num2);
    }
}
