/* 크냐? */
package Bronze5.Day20;

import java.util.Scanner;

public class BOJ4101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n==0 && m==0)
                break;
            else if (n > m)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
