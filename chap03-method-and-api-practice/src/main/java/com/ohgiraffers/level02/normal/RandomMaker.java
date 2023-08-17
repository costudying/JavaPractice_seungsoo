package com.ohgiraffers.level02.normal;

import java.util.Random;

public class RandomMaker {

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : rockPaperScissors
     *
     * 가위,바위,보 중에 하나를 출력
     * (가위,바위,보 는 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 가위
     * */

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */

    public static String rockPaperScissors(){

        Random random = new Random();

        int rockPaperScissors = 0;

        rockPaperScissors = random.nextInt(3)+1;

        String result = "";

        switch (rockPaperScissors){
            case 1 : result = "주먹"; break;
            case 2 : result = "보"; break;
            case 3 : result = "가위"; break;
        }

        System.out.println(result);

        return result;

    }

    public static String tossCoin(){

        Random random = new Random();

        int tossCoin = 0;

        tossCoin = random.nextInt(2)+1;

        String result = "";

        switch (tossCoin){
            case 1 : result = "앞면"; break;
            case 2 : result = "뒷면"; break;
        }
        System.out.println(result);

        return result;
    }


}
