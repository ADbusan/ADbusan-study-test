package jh_ex4;

import java.util.Scanner;

public class jh_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("과제 낸 사람의 출석 번호를 입력 : ");
        int[] a = new int[31];

        for (int i = 1; i < 29; i++) {
            int b = scan.nextInt();    //원래 b[i] = scan.nextInt();이면 차례대로 숫자가 입력되지만
                                       //b[i]는 28을 입력하면 b[i] i의 숫자가 차례대로 올라가기때문에 b[1]에 28번이 들어가는것
                                       //int b = scan.nextInt();으로 하면 내가 입력한 수 랑 인덱스 자리수랑 일치되게 들어간다면?
                                       //예를 들어 28번 입력하면 a[b] 인덱스 28번에 28번이 들어간다
            a[b] = 1 ;
        }
        for (int i= 1; i<a.length; i++) {
            if(a[i] != 1) {
                System.out.println(i);
            }
        }
    }
}