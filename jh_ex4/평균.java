package OX;

import java.util.Scanner;

public class 평균 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("각 반의 숫자를 입력 : ");
        int a = scan.nextInt();             //  반의 숫자를 입력 받아야함
        scan.nextLine();
        int[] b = new int[a];
        int num = 0;
        int c = 0;

        for (int i = 0; i < a; i++) {       // b[5,7,3,3,9]
            System.out.println("각   반에 몇명인지 입력 : ");
            b[i] = scan.nextInt();          //  각 반에 몇명인지 입력
        }
        for (int i = 0; i < b.length; i++) {       //  b[i]는 각 반의 학생수를 가지고있음
            num = b[i];
            for (int j = 0; j < num; j++) {
                System.out.println("각 반의 점수들을 입력");
                b[j]=scan.nextInt();        //  각 반의 점수들을 입력
                c=b[j]+c;//대입 받는걸 왼쪽으로각 반의 점수들을 일단 합을 구하고
            }  b[i]=c/num;  //   각 반의 평균점수를 구한후
        }
        for (int i = 0; i < a; i++) {
        System.out.println(b[i]);
        }
    }
}
//  EX = 학교



//  각 반의 평균점수보다 높은 사람의 비율을 출력
