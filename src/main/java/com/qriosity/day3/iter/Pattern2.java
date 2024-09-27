package com.qriosity.day3.iter;

public class Pattern2 {
    public static void main(String[] args) {
        // 1. 1부터 499까지 누적해서 출력하기
        int sum = 0;
        for (int i = 1; i <= 499; ++i)
            sum += i;
        System.out.println(sum);

        // 2. 1부터 100 사이에서 4의 배수만 누적해서 출력하기
        sum = 0;
        for (int i = 1; i <= 100; ++i)
            if (i % 4 == 0)
                sum += i;
        System.out.println(sum);

        // 3. 500부터 1까지 2식 감소하면서 5의 배수를 제외하고 누적해서 출력하기
        sum = 0;
        for (int i = 500; i >= 1; i -= 2) {
            if (i % 5 == 0) continue;
            sum += i;
        }
        System.out.println(sum);
    }
}
