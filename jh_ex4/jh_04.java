package jh_ex4;

import java.util.Scanner;

public class jh_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("9개의 정수를 입력 : ");
        int max = -1000000000;
        int count = 0;

        int[] b = new int[9];
        for (int i = 0; i < b.length; i++) {
            int a = scan.nextInt();
            b[i] = a;
            if (b[i] > max) {           // if(a>max){
                max = b[i];             // max = a;
                count = i+1;            // count++;
            }                           // }은 왜안나오지 ??
        }
        System.out.println("최댓값은 : "+max);
        System.out.println(count);
    }
}




