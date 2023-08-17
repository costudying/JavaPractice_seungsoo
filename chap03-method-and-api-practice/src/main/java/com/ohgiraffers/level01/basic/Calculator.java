package com.ohgiraffers.level01.basic;

public class Calculator {

    // 반환값 : x
    // 메소드명 : checkMethod
    // 호출하면 "메소드 호출 확인"을 출력하는 기능의 메소드

    // 반환값 : String
    // 메소드명 : sumTwoNumber
    // 두개의 전달인자를 받아 두수의 합을 반환
    // 출력의 내용은 "10과 20의 합은 30입니다." 라는 문장을
    // 출력하는 기능

    // 반환값 : String
    // 메소드명 : multiTwoNumber
    // 두개의 전달인자를 받아 두수의 곱을 반환
    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능


    public static void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public static String sumTwoNumber(int x, int y){
        int sum = x+y;
        String result = "10과 20의 합은 " + sum + "입니다.";
        System.out.println(result);
        return result;
    }
    public static String multiTwoNumber(int x,int y){
        int multi = x*y;
        String result = "10과 20의 곱은 " + multi + "입니다.";
        System.out.println(result);

        return result;
    }
}