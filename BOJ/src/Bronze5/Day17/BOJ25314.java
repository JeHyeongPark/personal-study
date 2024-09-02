/* 코딩은 체육과목 입니다 */
package Bronze5.Day17;

import java.util.Scanner;

public class BOJ25314 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int root = n/4;

        for(int i=0; i<root; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
