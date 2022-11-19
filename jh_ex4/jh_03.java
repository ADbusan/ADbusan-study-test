package jh_ex4;

import java.util.Scanner;

public class jh_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("배열할 인덱스 숫자를 입력하시오");
        int N = scan.nextInt();
        scan.nextLine();
        int[] a = new int[N];
        int max = -100000000;
        int min = 100000000;

        for (int i = 0; i < N; i++) {
            System.out.println("각 인덱스의 숫자를 입력하시오");
            a[i] = scan.nextInt();
            scan.nextLine();
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        } System.out.println(min + " " + max);
    }
}