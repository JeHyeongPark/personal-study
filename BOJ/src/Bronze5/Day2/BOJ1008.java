/* A/B */
package Bronze5.Day2;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();

        System.out.println(a/b);

        // float double -> 정밀도
        // float -> 소수점 6~7자리 정도 정도 표현이 가능
        // double -> 소수점 15~16 자리 정도 표현이 가능

        // 코테에선 double 쓰는게 낫다 float 보단
    }
}
