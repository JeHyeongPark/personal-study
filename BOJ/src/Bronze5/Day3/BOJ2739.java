package Bronze5.Day3;

import java.util.Scanner;

public class BOJ2739 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<10; i++){
            if(n > 9){
                break;
            }
            System.out.println(n+" * "+i+" = "+n*i);
        }

    }
}
/* 업데이트 확인 용 */
