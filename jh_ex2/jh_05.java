package jh_ex2;

import java.util.Scanner;

public class jh_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("시간을 입력");
        int time =scan.nextInt();
        System.out.println("분을 입력");
        int time2=scan.nextInt();

        if (time2>44){
            int num = time2-45;
            System.out.println(time+":"+num);
        }else if (time2<45){
            int num1 = (60+time2)-45;
            System.out.println(time-1+":"+num1);
        }
    }
}
