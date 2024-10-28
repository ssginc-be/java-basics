package com.qriosity.day20.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Queue-ri
 */
public class ReflectionTest {
    public static void main(String[] args) {
        try{
            //클래스 실행시에 로딩하라고 설정.
            Class<?> clazz = Class.forName("com.qriosity.day20.reflection.Person");
            //생성자 정보 획득
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            //생성자호출해서 객체를 생성해보자.
            Object person = constructor.newInstance("John", 30);

            //메서드 정보(객체) 획득
            Method setName = clazz.getMethod("setName", String.class);
            setName.invoke(person, "Jane"); //실행!
            Method getName = clazz.getMethod("getName");
            System.out.println(getName.invoke(person));
            Field age = clazz.getDeclaredField("age");
            age.setAccessible(true);
            age.setInt(person, 35);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}


class ReflectionAnnotation {
    public static void main(String[] args) {
        try {
            // 클래스 정보 가져오기
            Class<?> clazz = Class.forName("com.qriosity.day20.reflection.Person");
            Constructor<?> con = clazz.getConstructor(String.class, int.class);
            // 필드 정보 가져오기
            Field nameField = clazz.getDeclaredField("name");

            // 애노테이션 정보 가져오기
            if (nameField.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = nameField.getAnnotation(MyAnnotation.class);
                System.out.println("Field 'name' annotation value: " + annotation.value());
            }
            if (con.isAnnotationPresent(MyAnnotation2.class)) {
                MyAnnotation2 annotation = con.getAnnotation(MyAnnotation2.class);
                System.out.println("Field 'name' annotation value: " + annotation.value());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 예제용 애노테이션
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MyAnnotation {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface MyAnnotation2 {
    String value();
}


class Person {

    @MyAnnotation("나를 읽어가줘.")
    private String name;
    private int age;

    @MyAnnotation2("나는 생성자야. 읽어가줘.")
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}