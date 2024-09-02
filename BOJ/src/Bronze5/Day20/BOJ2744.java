/* 대소문자 바꾸기 */
package Bronze5.Day20;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] txt = sc.nextLine().toCharArray();
        for(int i=0; i<txt.length; i++){
            char x = txt[i];
            if(x >= 'a' && x <= 'z'){
                System.out.print((char)(x-32));
            }else{
                System.out.print((char)(x+32));
            }
        }
    }
}
