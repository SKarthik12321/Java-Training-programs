//Program 8 Even or Odd

import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
