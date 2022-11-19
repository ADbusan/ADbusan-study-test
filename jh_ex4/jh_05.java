package jh_ex4;

import java.util.Scanner;

public class jh_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("과제 낸 사람의 출석 번호를 입력 : ");
        int[] a = new int[30];

        for (int i = 0; i < 28; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(a);
    }
}
//진짜 모르겠음!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
