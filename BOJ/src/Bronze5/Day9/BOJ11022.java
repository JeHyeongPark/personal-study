/* A+B -8*/
package Bronze5.Day9;

import java.util.Scanner;

public class BOJ11022 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for(int i= 1; i<=x; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
        }

    }
}
