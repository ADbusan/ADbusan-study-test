package jh_ex2;

import java.util.Scanner;

public class jh_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("x 입력");
        int x = scan.nextInt();
        System.out.println("y 입력");
        int y = scan.nextInt();

        if(x>0 && y>0){
            System.out.println("1");
        } else if (x>0 && y<0) {
            System.out.println("4");
        } else if (x<0 && y>0) {
            System.out.println("2");
        } else if (x<0 && y<0) {
            System.out.println("3");
        }
    }
}
