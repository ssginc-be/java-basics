package com.qriosity.day15.generic;

/**
 * @author Queue-ri
 */
public class TruckTest {
    public static void main(String[] args) {
        Truck<String, Integer> truck = new Truck<>(); // 뒤의 <>는 타입 생략 가능
        truck.weight = "중량무게";
        truck.distance = 100;
        
        Truck<Double, String> truck2 = new Truck<>();
        truck2.weight = 123.345;
        truck2.distance = "장거리";

        System.out.println(truck);
        System.out.println(truck2);
    }
}

class Truck<T1, T2> {
    // 객체 생성 시 타입을 원하는대로 지정해서 쓸 수 있음
    // 클래스 작성 시 타입을 지정하지 않음
    // 특정(specific)하게 타입을 지정하지 않음 --> generic
    T1 weight;
    T2 distance;

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", distance=" + distance +
                '}';
    }
}
