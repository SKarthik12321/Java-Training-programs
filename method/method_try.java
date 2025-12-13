package method;

import java.util.*;

public class method_try {
    static void cyborg(String cname){
        System.out.println(cname + " Cyborg");
    }
    static void hero(String hname){
        System.out.println(hname + " Hero");
    }
    static void hunter(String gname){
        System.out.println(gname + " Hunter");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cyborg : ");
        String cname = sc.next();
        cyborg(cname);

        System.out.print("Enter the hero : ");
        String hname = sc.next();
        hero(hname);

        System.out.print("Enter the hunter : ");
        String gname = sc.next();
        hunter(gname);

        sc.close();
    }
}
