package com.qriosity.day15.primitive_typecast;

/**
 * @author Queue-ri
 */
public class Primitive1 {
    public static void main(String[] args) {
        byte b1 = 100;
        int i1 = 200;

        i1 = b1; // 묵시적 형변환 가능
        // b1 = i1; // err: 이건 불가능
        b1 = (byte)i1; // 강제형변환
        
    }
}
