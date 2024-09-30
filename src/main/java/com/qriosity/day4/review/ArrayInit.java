package com.qriosity.day4.review;

public class ArrayInit {
    public static void main(String[] args) {
        // 배열 생성시
        // 1. 처음부터 값을 알고 있는 경우
        int[] days = {1, 3, 4, 5, 6};

        // 2. 값을 모르는 경우
        // String[] doing = new String[]; --> err: 고정 크기 명시해야 함
        // String[][] doing = new String[3][]; --> 이건 생략 가능. C++ STL의 vector이라고 생각하면 됨
        String[] doing = new String[5]; // {null, null, null, null, null};
        doing[0] = "깃허브 정리";
        doing[1] = "기존 프로젝트 배포";
        doing[2] = "자격증 공부";
        doing[3] = "잔디 심기";
        doing[4] = "코테 문제 풀기";

        double[] temp = {22, 20, 15, 17, 19};

        System.out.println(days); // 주소가 찍혀 나옴

        for (int i = 0; i < days.length; ++i) {
            System.out.println(days[i] + " " + doing[i] + " " + temp[i]);
        }

        // for-each는 하나의 배열씩만 가능 / read 용도로만 사용 가능
        // temp 배열을 앞에서부터 순서대로 있는지 체크해서 하나씩 꺼내어 t에 할당하는 for문
        for (double t : temp) {
            System.out.println(t);
        }
    }
}
