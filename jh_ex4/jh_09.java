package jh_ex4;

import java.util.Scanner;

public class jh_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("반의 수를 입력 : ");
        int a = scan.nextInt();
        int[] b = new int[a]; //반의 수 입력
        System.out.print("각반의 학생수를 입력 : ");
        int c = scan.nextInt();
        int[] d = new int[c]; //각반의 학생수 입력

        float[] num = new float[a]; //각 반의 평균을 넣을 값
        float[] num2 = new float[a];//각 반의 평균을 넘는사람의 백분율

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("학생의 점수를 입력 : ");
                d[j] = scan.nextInt();
                num[i]+=d[j]/c;
                if (num[a]>d[j]){

                }
            }
        }
    }
}
// 몇반까지 있는지 입력후
// 각반의 학생수 입력
// 각반의 학생의 점수 입력
// 각반의 평균을 구한후
// 각반의 평균을 넘는 학생수를 구한후
// 평균을 넘는학생수의 평균을 구해서 출력
