package com.qriosity.day10.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Queue-ri
 */
public class RegEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //우리 회사 직원 정보를 입력을 받아보자.!!
        //아래는 모두 sc.next()로 입력받아 처리
        String pt1 = "^[가-힣]{3,5}$";
        String name;

        while (true) {
            System.out.print("이름입력>> "); //한글입력, 3-4글자이어야 함.
            name = sc.next();
            boolean res = name.matches(pt1);
            //제대로 입력했으면 "이름님 환영합니다"출력
            //      아니면 "다시 입력해야합니다."출력
            if (res) {
                System.out.println(name + "님 환영합니다");
                break;
            }
            else
                System.out.println("다시 입력해야합니다.");
        }

        String pt2 = "^[0-9]+$";
        String ageStr;
        int age;

        while (true) {
            System.out.print("나이입력>> "); //숫자만으로 이루어졌는지 확인!
            ageStr = sc.next();
            boolean res = Pattern.matches(pt2, ageStr);
            //숫자로 이루어졌으면 Integer.parseInt()로
            //숫자로 변환 후, 만으로 계산(-1)후 나이 출력
            if (res) {
                age = Integer.parseInt(ageStr);
                age -= 1;
                System.out.println("나이: " + age);
                break;
            }
            else
                System.out.println("다시 입력해야합니다.");
        }

        //new.com을 포함하고 있어야 함.
        String pt3 = "^[a-zA-Z0-9_]{5,8}@new\\.com$"; // \w로 바꿔도 동일함
        String email;

        while (true) {
            System.out.print("이메일입력>> "); //영문+숫자+_(언더바, 밑줄)포함한 5-8글자
            email = sc.next();
            boolean res = Pattern.matches(pt3, email);
            //유효하면 "이메일이 유효합니다." 출력
            //유효하지 않으면 "이메일이 유효하지 않습니다." 출력
            if (res) {
                System.out.println("이메일이 유효합니다.");
                break;
            }
            else
                System.out.println("이메일이 유효하지 않습니다.");
        }

        sc.close();
    }
}
