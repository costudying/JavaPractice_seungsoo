package com.ohgiraffers.section02.demensionalArray.level02.normal;

import java.util.Random;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 가로와 세로 길이를 정수형으로 입력 받아
         * 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고
         * 각 인덱스에는 랜덤으로 알파벳 대문자 넣어서 출력
         *
         * 단, 가로 행 혹은 세로 열은 반드시 1~10 까지의 정수를 입력해야 하고
         * 그렇지 않은 경우에는 "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요." 출력 후
         * 가로 행 또는 세로 열을 다시 입력받을 수 있도록 한다.
         *
         * -- 입력 예시 --
         * 가로 행의 수를 입력하세요 : 5
         * 세로 열의 수를 입력하세요 : 4
         *
         * -- 출력 예시 --
         * F H Z G
         * W F O T
         * O R X V
         * W H J X
         * W S S J
         * */

        int row;
        int column;
        char c = 'A';

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("가로 행의 수를 입력하세요 : ");
            row = sc.nextInt();

            if(row < 0 || row >11){
                System.out.println("다시 입력하세요.");
            }
        }while(row < 0 || row >11);

        do{
            System.out.println("세로 열의 수를 입력하세요 : ");
            column = sc.nextInt();

            if(column < 0 || column >11){
                System.out.println("다시 입력하세요.");
            }
        }while(column < 0 || column >11);

        char[][] alpha = new char[row][column];

        for(int i = 0; i < alpha.length; i++){
            for(int j = 0; j < alpha[i].length; j++){
                Random random = new Random();
                alpha[i][j] = (char)(c + random.nextInt(26));
            }
        }

        for (int i = 0; i<alpha.length; i++){
            System.out.println();
            for(int j = 0; j < alpha[i].length; j++){
                System.out.print(alpha[i][j] + " ");
            }
        }
    }
}
