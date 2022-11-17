package jh_ex3;

import java.util.Scanner;

public class jh_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 두번 입력하시오");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a+b;
        System.out.println(a+"+"+b+"="+c);

    }
}
