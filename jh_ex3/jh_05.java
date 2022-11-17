package jh_ex3;

import java.util.Scanner;

public class jh_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫 숫자를 입력하시오: ");
        int n = scan.nextInt();
//        n이 26이면
//        십의 자리 = 2
//        일의 자리 = 6
//        60+
        int temp = n;
        int count = 0;
        while (true) {
            int left = temp / 10;//십의 자리
            int right = temp % 10;//일의 자리

        }
    }
}