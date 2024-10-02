package com.qriosity.day5.review;

/**
 * @author Queue-ri
 */
public class ArrayReview {
    public static void main(String[] args) {
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};
        // 1. 성적이 2학기에 향상된 학생의 수를 카운트해서 출력하기
        int cnt = 0;
        for (int i = 0; i < term1.length; ++i) {
            if (term1[i] < term2[i]) {
                ++cnt;
            }
        }
        System.out.println("성적이 향상된 학생의 수: " + cnt);

        // 2. 성적이 1, 2학기 동일한 학생의 수를 카운트해서 출력하기
        cnt = 0;
        for (int i = 0; i < term1.length; ++i) {
            if (term2[i] == term1[i]) {
                ++cnt;
            }
        }
        System.out.println("성적이 동일한 학생의 수: " + cnt);
    }
}
