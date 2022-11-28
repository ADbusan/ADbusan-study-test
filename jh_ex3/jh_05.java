package jh_ex3;

import java.util.Scanner;
public class jh_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫 숫자를 입력하시오: ");
        int n = scan.nextInt();
        int temp = n;
        int count = 0;
        while (true) {
            int left = temp / 10;// a의 십의 자리
            int right = temp % 10;// a의 일의 자리
            int d = left+right; // d는 8
            int e =d%10;
            temp = right * 10 + e;// 68 d=left+right
            count++;
            if (temp == n) {
                break;
            }
        }
        System.out.println(temp);
        System.out.println(count);
    }
}
//26
//left = 2
//right = 6
//d = 8
//right *10 =60
//d % 10 = 8
//right % 10 +d % 10=68

//68
//left = 6
//right = 8
//d = 14
//right * 10 = 80
//d % 10 = 4
//right % 10 +d % 10=84

//84
//
//
//
//
//
//
//
//
//
//
