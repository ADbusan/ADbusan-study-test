package jh_ex1;

import java.util.Scanner;

public class jh_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 A를 입력하시오");
        int a = scan.nextInt();
        System.out.print("정수 B를 입력하시오");
        int b = scan.nextInt();
        if(a<10 && b<10){
            System.out.print(a/b);        }
    }
}
