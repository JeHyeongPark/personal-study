/* 과제 안내신분...?*/
package Bronze5.Day16;

import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int student[] = new int[31]; // 총크기 31, 인덱스 0~30


        // 28명 출석번호 입력 받기 인덱스 값을 1씩 올림
        for(int i=0; i<28; i++){
            int num = sc.nextInt();
            student[num]++;
        }
        // 30번 까지 돌렸을때 위에서 번호 안들어간얘 뽑기 (처음 배열 값 0이니까 위에서 안넣어준애들은 0임)
        for(int i=1; i<31; i++){
            if(student[i]==0){
                System.out.println(i);
            }
        }
    }
}
