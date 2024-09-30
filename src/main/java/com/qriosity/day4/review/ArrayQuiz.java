package com.qriosity.day4.review;

public class ArrayQuiz {
    public static void main(String[] args) {
        // 3일의 휴가기간 동안 매일 다른 곳을 여행가려 함
        // 1. 여행가고 싶은 지역 3곳을 배열에 넣기 (처음부터 알고 있는 경우)
        // 2. 여행 지역마다의 경부 (처음부터 알고 있는 경우)
        // 3. 함께 가고 싶은 사람 이름 (처음에는 모름)
        //    첫 번째 여행지만 "친구"로 나중에 결정됨

        // 다음과 같이 출력
        // 제주도   50000   친구
        // 울릉도   40000   null
        // 송도     10000   동생

        String[] place = {"제주도", "울릉도", "송도"};
        int[] budget = {50000, 40000, 10000};
        String[] comp = new String[3];
        comp[0] = "친구";

        for (int i = 0; i < place.length; ++i) {
            System.out.println(place[i] + "\t" + budget[i] + "\t" + comp[i]);
        }
    }
}
