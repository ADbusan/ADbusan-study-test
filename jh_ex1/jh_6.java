package jh_ex1;

import java.util.Scanner;

public class jh_6 {
//    두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 A를 입력하시오");
        int a = scan.nextInt();
        System.out.println("정수 B를 입력하시오");
        int b = scan.nextInt();

        if(1<=a && b<=10000){
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
            System.out.println(a%b);
        }
    }
}
