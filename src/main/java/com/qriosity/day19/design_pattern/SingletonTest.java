package com.qriosity.day19.design_pattern;

/**
 * @author Queue-ri
 */
public class SingletonTest {
    public static void main(String[] args) {
        // 싱글톤 객체는 싱글톤 클래스내부에서 하나만 만들도록 해야함.
        // 외부에서는 하나만 만들어놓은 싱글톤 객체의 주소를 가져다가 사용해야함.
        // 외부에서는 하나가 만들어졌는지 모름. static로 호출해서 확인!
        MySingleton sing1 = MySingleton.getInstance();
        System.out.println(sing1.hashCode());
        MySingleton sing2 = MySingleton.getInstance();
        System.out.println(sing2.hashCode());
    }
}

class MySingleton {
    // 객체를 하나만 만들어서 사용하는 것
    // 생성된 하나의 객체를 '싱글톤 객체'라고 함 <--> 반댓말은 '프로토타입'
    // 외부에서 객체 생성자 호출 불가해야 함
    private static MySingleton obj;

    private MySingleton () {
        System.out.println("객체 생성됨!");
    }

    public static MySingleton getInstance() {
        if (obj == null) {
            obj = new MySingleton();
        }
        return obj;
    }
}
