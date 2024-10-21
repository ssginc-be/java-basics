package com.qriosity.day15.quiz;

import java.util.ArrayList;

/**
 * @author Queue-ri
 */
public class Quiz4 {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("홍길동");
        stack.push("김길동");
        stack.push("박길동");
        stack.push("정길동");
        String pop_result = stack.pop();
        System.out.println("pop()결과>> " + pop_result);

        System.out.println("전체 목록>> " + stack.getList());
        System.out.println("비어있는지 여부>> " + (stack.isEmpty() ? "비었음" : "안비었음"));
        String peek_result = stack.peek();
        System.out.println("peek()결과>> " + peek_result);

        System.out.println("---------------------------");

        GenericStack<Integer> stack2 = new GenericStack<>();
        // 정수 데이터(100, 90, 70, 99)를 넣어 맨 첫번째 숫자를 삭제 후, 전체 점수 리스트 출력
        stack2.push(100);
        stack2.push(90);
        stack2.push(70);
        stack2.push(99);
        // 비었는지 확인하여 출력
        System.out.println("비었는지 확인: " + stack2.isEmpty());
        // 현재 stack 가장 위에 있는 데이터를 출력
        System.out.println("현재 stack의 top element: " + stack2.peek());
    }
}

class GenericStack<T> {
    ArrayList<T> list;

    public GenericStack() {
        list = new ArrayList<>();
    }

    public void push(T t) {
        list.add(t);
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }

    public T peek() {
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String getList() {
        return getAllElements();
    }

    public String getAllElements() {
        StringBuilder result = new StringBuilder();
        for (T e : list) {
            result.append(e).append(" ");
        }

        return result.toString().substring(0, result.length() - 1);
    }
}