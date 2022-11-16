package jh_ex2;

import java.util.Scanner;

public class jh_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("년도");
        int year = scan.nextInt();

        if (year%4==0 && year/100!=0 || year/400==0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
