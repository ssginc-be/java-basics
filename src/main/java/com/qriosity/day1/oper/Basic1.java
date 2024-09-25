package com.qriosity.day1.oper;

/**
 * @author Queue-ri
 */
public class Basic1 {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int sum = x + y; // int + int -> result is int
        System.out.println(sum);

        int div = y / x;
        System.out.println(div);

        double div2 = x / y;
        System.out.println(div2); // result is 0.0 -> error!
        
        // 자바는 정적타이핑이라서 정수 변수를 실수로 변경할 수 없음. --> 업캐스팅 외에 기본형 간 묵시적 형변환이 없다는 뜻인지??
        // CPU가 값을 가지고 와서 실수로 변경해주어야 함.
        double div3 = x / (double)y;
        System.out.println(div3);
    }
}
