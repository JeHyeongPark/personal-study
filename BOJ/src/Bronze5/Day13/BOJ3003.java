/* 킹,퀸,룩,비숍,나이트,폰 */
package Bronze5.Day13;

import java.util.Scanner;

public class BOJ3003 {

    public static void main(String[] args) {

        int pieces[] = {1, 1, 2, 2, 2, 8};

        Scanner sc = new Scanner(System.in);

        for(int i =0; i<6; i++){
            System.out.print(pieces[i]-sc.nextInt()+" ");
        }
    }
}



