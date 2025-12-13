package Practice;

import java.util.*;

class addition {
    public int add(int x, int y) {
        return x + y;
    }
}
public class usingObjects {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1 : ");
        int a = sc.nextInt();
        System.out.print("Enter number2 : ");
        int b = sc.nextInt();

        addition c = new addition();
        int result = c.add(a, b);
        System.out.println(result);
        sc.close();
    }
}



