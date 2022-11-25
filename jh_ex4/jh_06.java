package jh_ex4;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class jh_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("몇개의 정수를 입력할지 정하시오 : ");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println(n + "개의 정수를 입력하시오 : ");
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            a[i] = a[i] % 42;
        }
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    temp++;
                }
            }
            if (temp == 0) {
                count++;
            }
        }System.out.println(count);
    }
}





//열개의 정수를 입력 받고
//각 수를 42로 나눈 나머지가 몇개 나오는지 출력
//나머지가 0일때도 한개로 출력
//같은수는 한개로 쳐서 출력
