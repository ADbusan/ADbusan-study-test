package jh_ex4;

import java.util.Scanner;

public class jh_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("케이수의 수를 입력 하시오 : ");
        int a = scan.nextInt();
        String[] b = new String[a];

        for (int i = 0; i < b.length; i++) {
            int count = 0;
            int num = 0;
            for (int j = 0; j < b.length; j++) {
                b[j]= scan.nextLine();
                if (b[j]=="O"){
                    count++;
                    count+=num;
                }else {
                    count = 0;
                }
            }
            System.out.println(num);
        }
    }
}
