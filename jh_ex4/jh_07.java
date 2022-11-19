package jh_ex4;

import java.util.Scanner;

public class jh_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("과목이 몇개인지 입력 : ");
        int a = scan.nextInt();
        float[] b = new float[a];    //b[]에 값이 들어있음
        float max = -10000000;       //max값에 최대값이 들어있음
        float num = 0;
        float num1 = 0;
        for (int i = 0; i < a; i++) {
            System.out.print("각 과목의 점수를 입력하시오 : ");
            b[i] = scan.nextInt();//a개의 점수가 b[i]에 들어감
            if (b[i] > max) {
                max = b[i];
            }
        }
        for (int i = 0; i < a; i++) {
            b[i] = (b[i]/max)*100;//각 점수를 최대값이랑 나눈것에 *100
            num += b[i];
            num1 = num/a;
       }
        System.out.println("평균 값은 : "+num1);
    }
}
//  각 점수를 최대값이랑 나누고 *100 한후 3가지를 다더해서 /3을 해야됨