package OX;

import java.util.Scanner;

public class OXOXOX {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("케이스의 줄을 입력 : ");
            int N = sc.nextInt();                               //N개의 케이스 줄을 입력받음           ex:N에 5를 입력 받는다
            sc.nextLine();
            String[] arr = new String[N];                       //N개의 인덱스가 생김                 ex:arr[0,1,2,3,4]
            for (int i = 0; i < N; i++) {
                System.out.println("O,X중 입력 :");
                arr[i] = sc.nextLine();                         //N개의 인덱스에 각각 문자열을 입력
                                                                // ex:arr[OOXXO,XXX,OOOO,X,O]
            }                                                   //ex:arr[0]에 o.x를 무한이 넣을수있음
            int[] result = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;  //4
                int check = 0;//0
                for (int j = 0; j < arr[i].length(); j++) {     // arr[i].length()는 arr[0]에 들어있는 인덱스의 숫자를 의미
                    if (arr[i].charAt(j) == 'O') {              // OOXXO
                        check++;
                        sum += check;                           //sum = sum + check ;
                    } else {
                        check = 0;
                    }
                }
                result[i] = sum;
            }
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }
    }

