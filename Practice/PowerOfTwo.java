package Practice;// Program 3 Power of 2

import java.util.*;

public class PowerOfTwo {
    public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 1;
        for (int i = 1; i <= n; i++){
            power = power * 2;
            System.out.println(power);
        }
        sc.close();
    }
}
