package jh_ex2;

import java.util.Scanner;

public class jh_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("시간을 입력");
        int time =scan.nextInt();
        System.out.println("분을 입력");
        int time2= scan.nextInt();

        if (time2<45){
            time--;
            if (time<0){
                time = 23;
                System.out.println(time+":"+(time2+60-45));
            }
        }
        }
    }

