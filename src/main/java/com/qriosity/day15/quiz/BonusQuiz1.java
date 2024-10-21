package com.qriosity.day15.quiz;

/**
 * @author Queue-ri
 */
public class BonusQuiz1 {
    public static void main(String[] args) {
        // Generic 추가문제 1:
        // 다음과 같이 객체 생성시 타입을 지정하여 사용할 수 있도록 Box<T> 클래스를 만드시오.

        // 정수를 저장하는 Box
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println("Integer Box: " + integerBox.getContent());
        // 문자열을 저장하는 Box
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello");
        System.out.println("String Box: " + stringBox.getContent());
    }
}

class Box<T> {
    T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}