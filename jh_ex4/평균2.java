package OX;

import java.util.Scanner;

public class 평균2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("몇반까지 있는지 입력 :");
        int a = scan.nextInt();

        for (int i = 0; i <a; i++) {
            System.out.println("학생수를 입력 : ");
            int b = scan.nextInt();
            int count = 0;//평균을 넘는 학생수
            double c = 0; //평균 점수
            double d;     //평균을 넘는 학생 비율
            int[] e = new int[b];//각 점수를 저장할 배열
            for (int j = 0; j < b; j++) {
                System.out.println("각 점수를 입력 : ");
                int f = scan.nextInt();
                e[j] = f;
                c += f; //각 점수의 합
            }
            c=c/b;      //평균 점수
            for (int k = 0; k<e.length; k++){
                if (e[k]>c){
                    count++;//각 반의 평균점수 보다 높은 학생의 수
                }
            }
            d = (double) count/b*100;
            System.out.printf("%.3f",d);
            System.out.println("%");
        }
    }
}
