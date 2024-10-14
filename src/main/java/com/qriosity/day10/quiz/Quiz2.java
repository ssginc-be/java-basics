package com.qriosity.day10.quiz;

/**
 * @author Queue-ri
 */
public class Quiz2 {
    public static void main(String[] args) {
        Day d1 = new Day("자바공부", 10, "강남");
        Day d2 = new Day("여행", 15, "강원도");
        Day d3 = new Day("운동", 11, "피트니스");

        // 1) 전체 하는 일의 시간
        System.out.println(Day.totalTime);
        // 2) 평균 하는 일의 시간
        System.out.println(Day.totalTime/(double)Day.count);
        // 3) 매일 무엇을 얼마나 했는지 출력하기
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
    }

}

class Day {
    String content;
    int time;
    String place;
    static int totalTime;
    static int count;

    public Day(String content, int time, String place) {
        this.content = content;
        this.time = time;
        this.place = place;
        totalTime += time;
        ++count;
    }

    @Override
    public String toString() {
        return "Day{content='" + content + "', time=" + time + ", place='" + place + "'}";
    }
}