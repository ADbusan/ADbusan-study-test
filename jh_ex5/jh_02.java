package jh_ex5;

import java.util.Arrays;

public class jh_02 {
    public static int d(int number) {
        int sum = number;
        while(number!=0){
            sum+=number%10;//첫째자리 수
            number = number/10;  //10울 나누어 첫째 자리를 없앤다
        }
        return sum;
    }
//    1 = 2
//    2 = 4
//    3 = 6
//    4 = 8
//    5 = 10
//    6 = 12
//    7 = 14
//    8 = 16
//    9 = 18
//    10 = 11
//    11 = 13
//    12 = 15
//    13 = 17
//    14 = 19
//    15 = 21
//    16 = 23
    public static void main(String[] args) {
        boolean[] num = new boolean[10001];
        for(int i=1;i<num.length;i++){
            int a = d(i);
            if (a<10001){
            num[a] = true;        // 셀프 넘버가 아닌 인덱스에 true가 들어가있음
            }
        }
        for(int i=1;i<num.length;i++){
            if (num[i]==false){              //  num[i]안에 false이면
                System.out.println(i);  //  인덱스 안에 false인것 만 출력
            }                                //  출력되는것들이 셀프 넘버인 인덱스들
        }// 그럼 인덱스 넘버만 출력 하는방법은?
    }
}
