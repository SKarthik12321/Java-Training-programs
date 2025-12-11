//Functional Program 5 Temperature Check(WindChill)

import java.util.*;

public class WindChill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature(F) and wind speed : ");
        double t = sc.nextDouble();
        double v = sc.nextDouble();
        if (Math.abs(t) > 50 || v < 3 || v > 120) {
            System.out.println("Invalid input for wind chill formula");
            return;
        }
        else{
            double windChill = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * (Math.pow(v, 0.16));
            System.out.println("Wind Chill : " + windChill);
        }
        sc.close();
    }
}
