package Practice;//Program 10 Largest of Three Numbers

import java.util.*;

public class LargestOfThreeNumbers {
    public static void main(String[] args){
        System.out.print("Enter three numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Maximum number is " + Math.max(a, Math.max(b,c)));
    }
}
