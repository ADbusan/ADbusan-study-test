package jh_ex3;

import java.util.Scanner;

public class jh_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n을 입력하시오 : ");
        int n = scan.nextInt();
        int result = 0;
        if (1<=n && n<=10000){
            for (int i = 1; i<=n ; i++){
                result+=i;
            }System.out.println(result);
        }

    }
}
