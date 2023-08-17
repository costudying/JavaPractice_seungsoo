package com.ohgiraffers.section01.array.level01.basic;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Application1 {

    public static void main(String[] args) {

        /* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
         * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
         * */

        int[] x = new int[9];

        for(int i = 0; i <= x.length; i++ ){
            x[i] = i+1;
            System.out.println(x[i]);
        }
    }

}
