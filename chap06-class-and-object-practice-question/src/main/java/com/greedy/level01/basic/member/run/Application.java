package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {

        String id = "hong";
        String pwd = "hong";
        String name = "hong";
        int age = 20;
        char gender = 'M';
        String phone = "010-0000-0000";
        String email = "hong@naver.com";

        MemberDTO memberDTO = new MemberDTO();
        System.out.println("id : " + memberDTO.getId());
        System.out.println("pwd : " + memberDTO.getPwd());
        System.out.println("name : " + memberDTO.getName());
        System.out.println("age : " + memberDTO.getAge());
        System.out.println("gender : " + memberDTO.getGender());
        System.out.println("phone : " + memberDTO.getPhone());
        System.out.println("email : " + memberDTO.getEmail());
        System.out.println();

        memberDTO.setId(id);
        memberDTO.setPwd(pwd);
        memberDTO.setName(name);
        memberDTO.setAge(age);
        memberDTO.setGender(gender);
        memberDTO.setPhone(phone);
        memberDTO.setEmail(email);

        System.out.println("변경 후 id : " + memberDTO.getId());
        System.out.println("변경 후 pwd : " + memberDTO.getPwd());
        System.out.println("변경 후 name : " + memberDTO.getName());
        System.out.println("변경 후 age : " + memberDTO.getAge());
        System.out.println("변경 후 gender : " + memberDTO.getGender());
        System.out.println("변경 후 phone : " + memberDTO.getPhone());
        System.out.println("변경 후 email : " + memberDTO.getEmail());

    }
}
