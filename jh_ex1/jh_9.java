package jh_ex1;

import java.util.Scanner;

public class jh_9 {
//      동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
//      체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
//      체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//      동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int King = scan.nextInt();
        int Qneen= scan.nextInt();
        int look = scan.nextInt();
        int Bishop=scan.nextInt();
        int Nite = scan.nextInt();
        int pon =  scan.nextInt();

        if (King == 1) {
            System.out.println("킹은 갯수가 맞습니다");
        } else{
            System.out.println("킹의 갯수가 맞지 않습니다");
        }
            if (Qneen==1) {
            System.out.println("퀸의 갯수가 맞습니다");
            } else{
            System.out.println("퀸의 갯수가 맞지 않습니다");
            }
            if (look==2) {
            System.out.println("룩의 갯수가 맞습니다");
            }else {
                System.out.println("룩의 갯수가 맞지 않습니다");
            }
            if (Bishop==2){
                System.out.println("비숍의 갯수가 맞습니다");
            }else {
                System.out.println("비숍의 갯수가 맞지않습니다");
            }
            if (Nite==2){
                System.out.println("나이트의 갯수가 맞습니다");
            }else {
                System.out.println("나이트의 갯수가 맞지않습니다");
            }
            if (pon==8){
                System.out.println("폰의 갯수가 맞습니다");
            }else {
                System.out.println("폰의 갯수가 맞지않습니다");
            }
    }

}

