package jh_ex1;

import java.util.Scanner;

public class jh_10 {
    public static void main(String[] args) {
//        (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
        Scanner scam = new Scanner(System.in);
        System.out.println("A를 입력하시오");
        int a = scam.nextInt();
        System.out.println("B를 입력하시오");
        int b = scam.nextInt();
        System.out.println("C를 입력하시오");
        int c = scam.nextInt();
        int num = (a+b)%c;
        int num1= ((a%b)+(b+c))%c;
        int num2=(a*b)%c;
        int num3=((a%b)*(b+c))%c;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}
