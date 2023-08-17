package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         * 검색할 문자를 입력하세요 : l
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         * */

        char[] word;
        char letter;
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 하나 입력하세요 : ");
        word = sc.next().toCharArray();
        System.out.println("검색할 문자를 입력하세요 : ");
        sc.nextLine();
        letter = sc.next().charAt(0);

        int x = 0;
        String letters = null;

        for(int i = 0; i < word.length; i++){
            if(word[i] == letter){
                x++;
            }
        }

        System.out.println("입력하신 문자열 " + String.valueOf(word) + "에서 찾으시는 문자 " + letter + "은 "
                +  x + "개입니다.");
    }
}
