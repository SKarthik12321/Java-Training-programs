//Program 6 Compute Quotient And Remainder

import java.util.*;

public class QuotientRemainder {
    public static void main(String[] args){
        System.out.print("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Quotient is " + a/b);
        System.out.println("Remainder is " + a%b);
    }
}
