package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String[] studentList = new String[10];

        StudentDTO studentInfo = new StudentDTO();

        int[] average = new int[10];

        studentInfo.setGrade(1);
        studentInfo.setClassroom(5);
        studentInfo.setName("홍길동");
        studentInfo.setKor(40);
        studentInfo.setEng(60);
        studentInfo.setMath(70);

        studentList[0] = String.valueOf(studentInfo.information());
        average[0] = (studentInfo.getKor() + studentInfo.getEng() + studentInfo.getMath())/3;

        studentInfo.setGrade(2);
        studentInfo.setClassroom(1);
        studentInfo.setName("김말똥");
        studentInfo.setKor(70);
        studentInfo.setEng(80);
        studentInfo.setMath(100);

        studentList[1] = String.valueOf(studentInfo.information());
        average[1] = (studentInfo.getKor() + studentInfo.getEng() + studentInfo.getMath())/3;

        studentInfo.setGrade(3);
        studentInfo.setClassroom(3);
        studentInfo.setName("강개순");
        studentInfo.setKor(100);
        studentInfo.setEng(75);
        studentInfo.setMath(86);

        studentList[2] = String.valueOf(studentInfo.information());
        average[2] = (studentInfo.getKor() + studentInfo.getEng() + studentInfo.getMath())/3;


        int cnt = 3;
        char status;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("학년을 입력하세요.");
            studentInfo.setGrade(sc.nextInt());

            System.out.println("반을 입력하세요.");
            studentInfo.setClassroom(sc.nextInt());

            System.out.println("이름을 입력하세요.");
            sc.nextLine();
            studentInfo.setName(sc.nextLine());

            System.out.println("국어점수를 입력하세요.");
            studentInfo.setKor(sc.nextInt());

            System.out.println("영어점수를 입력하세요.");
            studentInfo.setEng(sc.nextInt());

            System.out.println("수학점수를 입력하세요.");
            studentInfo.setMath(sc.nextInt());

            studentList[cnt] = String.valueOf(studentInfo.information());
            average[cnt] = (studentInfo.getKor() + studentInfo.getEng() + studentInfo.getMath())/3;

            cnt++;

            System.out.println("계속 추가하시겠습니까? (Y or N) ");
            sc.nextLine();
            status = sc.nextLine().charAt(0);

        }while(status == 'Y');

        for(int i = 0; i < cnt; i++){
            System.out.println( studentList[i] + ", 평균 점수 : " + average[i]);
        }
    }
}
