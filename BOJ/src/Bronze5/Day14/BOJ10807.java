/* 개수 세기 */
package Bronze5.Day14;

import java.util.Scanner;

public class BOJ10807 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];

        for(int i =0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int cunt = 0;

        for(int j=0; j< n; j++){
            if(array[j]==x){
                cunt++;
            }
        }
        System.out.println(cunt);
    }
}
