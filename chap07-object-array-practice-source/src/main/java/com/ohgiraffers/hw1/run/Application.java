package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {
        Object[] emp = new Object[3];

        EmployeeDTO employee1 = new EmployeeDTO();

        emp[0] = employee1;

        System.out.println("emp[0] : " + employee1.information());

        EmployeeDTO employee2 = new EmployeeDTO();

        employee2.setEmpNo(1);
        employee2.setEmpName("홍길동");
        employee2.setAge(19);
        employee2.setGender('M');
        employee2.setPhone("01022223333");
        employee2.setAddress("서울 잠실");

        emp[1] = employee2;

        System.out.println("emp[1] : " + employee2.information());

        EmployeeDTO employee3 = new EmployeeDTO();

        employee3.setEmpNo(2);
        employee3.setEmpName("강말순");
        employee3.setDept("교육부");
        employee3.setJob("강사");
        employee3.setAge(20);
        employee3.setGender('F');
        employee3.setSalary(1000000);
        employee3.setBonusPoint(0.01);
        employee3.setPhone("01011112222");
        employee3.setAddress("서울 마곡");

        emp[2] = employee3;

        System.out.println("emp[2] : " + employee3.information());

        System.out.println("=================================================================");

        employee1.setEmpNo(0);
        employee1.setEmpName("김말똥");
        employee1.setDept("영업부");
        employee1.setJob("팀장");
        employee1.setAge(30);
        employee1.setGender('M');
        employee1.setSalary(3000000);
        employee1.setBonusPoint(0.2);
        employee1.setPhone("01055559999");
        employee1.setAddress("전라도 광주");

        emp[0] = employee1;

        System.out.println("emp[0] : " + employee1.information());

        employee2.setDept("기획부");
        employee2.setJob("부장");
        employee2.setSalary(4000000);
        employee2.setBonusPoint(0.3);

        emp[1] = employee2;

        System.out.println("emp[1] : " + employee2.information());

        System.out.println("=================================================================");

        int kimSal = (int) ((employee1.getSalary() + (employee1.getSalary()*employee1.getBonusPoint()))*12);
        int hongSal = (int) ((employee2.getSalary() + (employee2.getSalary()*employee2.getBonusPoint()))*12);
        int kangSal = (int) ((employee3.getSalary() + (employee3.getSalary()*employee3.getBonusPoint()))*12);

        System.out.println(employee1.getEmpName() + "의 연봉 : "+ kimSal+"원");
        System.out.println(employee2.getEmpName() + "의 연봉 : "+ hongSal+"원");
        System.out.println(employee3.getEmpName() + "의 연봉 : "+ kangSal+"원");

        System.out.println("=================================================================");

        int total = (kimSal+hongSal+kangSal)/3;
        System.out.println("직원들의 연봉의 평균 : " + total+ "원");





    }
}
