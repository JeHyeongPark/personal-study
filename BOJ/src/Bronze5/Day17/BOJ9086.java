/* 문자열 */
package Bronze5.Day17;

import java.util.Scanner;

public class BOJ9086 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for(int i=0; i<test; i++){
            String txt = sc.next();
            String ans = txt.charAt(0) + txt.substring(txt.length()-1);
            System.out.println(ans);
        }
    }
}
