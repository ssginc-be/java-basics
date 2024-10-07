package com.qriosity.day6.array;

/**
 * @author Queue-ri
 */
public class TwoDimArray2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][]; // --> arr 변수와 참조변수 3개, length까지 총 5개의 변수 생성됨
        System.out.println(arr.length);

        // 참조형 4바이트 변수 --> arr, arr[0], arr[1], arr[2]
        // length 변수는 4바이트
        // 따라서 총 4*5=20바이트 할당된 상태
        System.out.println(arr[0]); // 1차원 배열 할당 안해서 null로 나옴
        System.out.println(arr); // 주소 출력... 근데 int** 라서 출력 생김새가 좀 다름

        // for-each는 Read Only라서 불가
        for (int i = 0; i < arr.length; ++i) { // 코드 포맷팅: Ctrl + Alt + L
            arr[i] = new int[10];
        }

        System.out.println(arr[0]);

    }
}
