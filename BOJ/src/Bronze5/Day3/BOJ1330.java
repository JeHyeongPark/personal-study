/* 두 수 비교하기 */
package Bronze5.Day3;

import java.util.Scanner;

public class BOJ1330 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println(">");
        }else if(a < b){
            System.out.println("<");
        }else{
            System.out.println("==");
        }

    }
}
