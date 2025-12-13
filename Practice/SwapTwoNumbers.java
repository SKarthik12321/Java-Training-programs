package Practice;//Program 7 Swap Two Numbers

import java.util.*;

public class SwapTwoNumbers {
    public static void main(String[] args){
        System.out.print("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped numbers are " + a + " and " + b);
    }
}
