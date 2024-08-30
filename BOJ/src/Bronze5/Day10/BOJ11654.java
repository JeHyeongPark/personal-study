/* 아스키 코드 */
package Bronze5.Day10;

import java.util.Scanner;

public class BOJ11654 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String txt = sc.next();
        char txtChr = txt.charAt(0);

        System.out.println((int)txtChr);

    }
}

/* Integer.parseInt() 이거는 문자열을 정수로 변환하는 메소드
* char 를 바꾸려면 (int) 이런식으로 해야한다.*/

/*
아스키 코드 값을 받았을때 글자로 바꾸는 방법
int num = sc.nextInt();
System.out.println((char)num); */

