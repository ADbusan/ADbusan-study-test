package jh_ex4;

import java.util.Scanner;

public class jh_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int N = sc.nextInt();
        int[] array = new int[N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("정수를 "+N+" 번 입력하시오 : " );
            array[i] = sc.nextInt();
        }
        System.out.print("숫자의 갯수를 알고싶으면 정수를 적으시오");
        int v = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (array[i] == v) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
