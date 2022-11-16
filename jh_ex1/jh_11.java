package jh_ex1;

import java.util.Scanner;

public class jh_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("세자리수를 입력하시오");
        int a = scan.nextInt();
        System.out.println("세자리수를 입력하시오");
        int b = scan.nextInt();

        System.out.println(a*(b%10));
        System.out.println(a*b);
        System.out.println(a*(b/100));
        System.out.println(a*b);

    }
}
