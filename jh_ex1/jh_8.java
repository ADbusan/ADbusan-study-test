package jh_ex1;

import java.util.Scanner;

public class jh_8 {
//      ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다. 공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.
//      불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다. 반면, 우리나라는 서기 연도를 사용하고 있다. 불기 연도가 주어질 때 이를 서기
//      연도로 바꿔 주는 프로그램을 작성하시오.
//      석가모니가 태어난 때가 아니라 입적한 때를 기준으로 삼기 때문에 이런 실수가 나오기도 한다. 불기 원년(1년)은 서기전 544년이므로, 서기를 불기로 변환할 때는 544를 더하면 된다.
//      쉽게 말해 서기 2000년은 불기 2544년인 셈.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("년도를 입력하시오");
        int Year = scan.nextInt();

        if (1000<= Year && Year<=3000){
            System.out.println(Year-543);
        }
    }
}
