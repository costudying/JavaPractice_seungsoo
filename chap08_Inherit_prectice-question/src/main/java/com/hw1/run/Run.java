package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Person;
import com.hw1.model.dto.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Object[] info1 = new Object[3];

        Student studentInfo = new Student();

        studentInfo.setName("홍길동");
        studentInfo.setAge(20);
        studentInfo.setHeight(178.2);
        studentInfo.setWeight(70.0);
        studentInfo.setGrade(1);
        studentInfo.setMajor("정보시스템공학과");

        info1[0] = studentInfo.information();

        studentInfo.setName("김말똥");
        studentInfo.setAge(21);
        studentInfo.setHeight(187.3);
        studentInfo.setWeight(80.0);
        studentInfo.setGrade(2);
        studentInfo.setMajor("경영학과");

        info1[1] = studentInfo.information();

        studentInfo.setName("김장군");
        studentInfo.setAge(23);
        studentInfo.setHeight(167.0);
        studentInfo.setWeight(45.0);
        studentInfo.setGrade(4);
        studentInfo.setMajor("정보통신공학과");

        info1[2] = studentInfo.information();

        /*for(int i =0; i< info.length; i++){
            System.out.println(info[i]);
        }*/

        for (Object list : info1) {
            System.out.println(list);
        }

        Object[] info2 = new Object[10];
        Employee employeeInfo = new Employee();

        int cnt = 0;

        System.out.println();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("이름 : ");
            employeeInfo.setName(sc.nextLine());

            System.out.println("나이 : ");
            employeeInfo.setAge(sc.nextInt());

            System.out.println("키 : ");
            employeeInfo.setHeight(sc.nextDouble());

            System.out.println("몸무게 : ");
            employeeInfo.setWeight(sc.nextDouble());

            System.out.println("급여 : ");
            employeeInfo.setSalary(sc.nextInt());

            System.out.println("부서 : ");
            sc.nextLine();
            employeeInfo.setDept(sc.nextLine());

            cnt++;

            info2[cnt] = employeeInfo.information();

            System.out.println("계속 추가하시겠습니까? (Y or N)");
            char status = sc.nextLine().toUpperCase().charAt(0);

            if(status == 'N'){
                break;
            }
        }

        for (Object list : info2) {
            System.out.println(list);
        }

    }
}
