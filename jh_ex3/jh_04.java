package jh_ex3;

import java.util.Scanner;

public class jh_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("총 금액을 적으시오: ");
        int a = scan.nextInt();
        System.out.print("종류의 갯수를 적으시오: ");
        int b = scan.nextInt();
        int result = 0;
        for (int i = 0; i <b;i++){
            System.out.print("금액을 적으시오: ");
            int c = scan.nextInt();
            System.out.print("갯수를 적으시오: ");
            int d = scan.nextInt();
            int money = c*d;
            result+=money;
            }if(a==result){
                System.out.println("yes");
            }else{
                System.out.println("no");
        }
    }
}
