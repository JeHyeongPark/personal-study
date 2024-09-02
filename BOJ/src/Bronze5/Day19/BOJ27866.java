/* 문자와 문자열 */
package Bronze5.Day19;

import java.util.Scanner;

public class BOJ27866 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.next();
        int n = sc.nextInt();

        System.out.println(txt.charAt(n-1));
    }
}
