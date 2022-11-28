package jh_ex4;

import java.util.Scanner;

public class jh_05_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("과제 낸 사람의 출석 번호를 입력 : ");
        int[] a = new int[31];
        System.out.println(a[2]);
        for (int i = 1; i < 3; i++) {
            int b = scan.nextInt();
            a[b] = 1;
        }
        System.out.println(a[2]);
        System.out.println(a[1]);

    }
}
