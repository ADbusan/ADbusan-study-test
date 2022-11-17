package jh_ex3;

import java.util.Scanner;

public class jh_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("구구단의 단을 입력하시오");
        int a = scan.nextInt();

            for (int j = 0+1; j < 10; j++) {
                int b = j;
                int c = a*j;
                System.out.println(a+"*"+b+"="+c);
            }
        }
    }

