package com.qriosity.day10.quiz;

/**
 * @author Queue-ri
 */
public class Quiz3 {
    public static void main(String[] args) {
        Employee work1 = new Employee("홍길동", 25, "여");
        Employee work2 = new Employee("김길동", 24, "남");
        Employee work3 = new Employee("송길동", 26, "여");

        // 1) 우리 회사의 직원 수는?
        System.out.println(Employee.count);
        // 2) 직원 각각의 정보 출력하기
        System.out.println(work1.toString());
        System.out.println(work2.toString());
        System.out.println(work3.toString());
        // 3) 직원 평균 나이 출력하기
        System.out.println(Employee.totalAge/(double)Employee.count);
    }
}

class Employee {
    String name;
    int age;
    String gender;
    static int totalAge;
    static int count;

    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        totalAge += age;
        this.gender = gender;
        ++count;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", gender='" + gender + "'}";
    }
}