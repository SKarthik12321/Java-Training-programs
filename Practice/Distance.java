package Practice;// Functional Program 3 Euclidean Practice.Distance

import java.util.*;

public class Distance {
    public static void main(String[] args){
        System.out.print("Enter two integers : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double distance = Math.sqrt(x*x + y*y);
        System.out.println("The Euclidean Practice.Distance between x and y is : " + distance);
        sc.close();
    }
}
