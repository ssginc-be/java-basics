package com.qriosity.day15.quiz;

import com.qriosity.day15.reference_typecast.Person;

import java.util.ArrayList;

/**
 * @author Queue-ri
 */
public class Quiz3 {
    // 1,2번은 쉬워서 풀이 생략함
    // Q3. 다음 코드에 대해 자동형변환/강제형변환/박싱/언박싱 관점에서 주석을 달아 설명하시오
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("자바"); // 자동형변환(generic)

        list.add(new Person()); // 자동형변환(generic)
        list.add(new ArrayList()); // 자동형변환(generic)

        String s = (String)list.get(0); // 강제형변환

        list.add(100); // int --> Integer 박싱, 자동형변환(generic)

        int i = (Integer)list.get(3); // 강제형변환, Integer --> int 언박싱
    }
}
