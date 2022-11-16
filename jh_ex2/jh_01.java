package jh_ex2;

import java.util.Scanner;

public class jh_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A를 입력하시오");
        int a = scan.nextInt();
        System.out.println("B를 입력하시오");
        int b = scan.nextInt();

        if (-10000 <= a || b <= 10000) {
            if (a > b) {
                System.out.println("a>b");
            }
            if (a < b) {
                System.out.println("b<a");
            }
            if ((a == b)) {
                System.out.println("a=b");
            }
        }else {
            System.out.println("잘못된 입력값입니다");
        }
    }
}