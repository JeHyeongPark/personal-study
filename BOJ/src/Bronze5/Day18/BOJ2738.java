/* 행렬 덧셈 */
package Bronze5.Day18;

import java.util.Scanner;

public class BOJ2738 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j] += sc.nextInt();
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
