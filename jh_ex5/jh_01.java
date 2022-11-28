package jh_ex5;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class jh_01 {
    public static int test(int a){
        int hap = 0;
        for(int i=0; i<a; i++){
            hap+=i;

        } return hap;
    }

    public static void main(String[] args) {
        System.out.println(test(10));
    }
}
