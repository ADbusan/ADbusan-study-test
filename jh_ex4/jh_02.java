package jh_ex4;

import java.util.Scanner;

public class jh_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("수열을 몇개로 쓸건지 입력 :");
        int N = scan.nextInt();
        scan.nextLine();
        int[] a = new int[N];
        System.out.println("정수를 입력 : ");
        int X = scan.nextInt();
        scan.nextLine();

        if (1<=N && X<=10000) {
            for (int i = 0; i < N; i++) {
                System.out.println(N+"만큼 수열을 입력 :  ");
                a[i] = scan.nextInt();
                scan.nextLine();
                //이후로 X보다 낮은 숫자가 출력되야됨
                }
            for (int i = 0; i < N; i++){
                if (a[i]<X) {
                System.out.print(a[i]);
              }
            }
        }else {
            System.out.println("다시 입력하시오 :");
        }
    }
}
