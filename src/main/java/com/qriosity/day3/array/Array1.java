package com.qriosity.day3.array;

public class Array1 {
    public static void main(String[] args) {
        // 유한 공간, 동일한 타입일 때
        int[] a = new int[5]; // {0, 0, 0, 0, 0} 으로 생성됨 (자동으로 초기화 됨)
        System.out.println(a[0]);
        System.out.println(a[1]);

        // 처음부터 할당할 값을 알고 있는 경우
        int[] a2 = {100, 200, 300, 400, 500};
        System.out.println(a2[0]);
        System.out.println(a2[1]);
    }
}
