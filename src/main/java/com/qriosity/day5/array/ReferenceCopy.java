package com.qriosity.day5.array;

import java.util.Arrays;

/**
 * @author Queue-ri
 */
public class ReferenceCopy {
    public static void main(String[] args) {
        int[] term1 = {100, 200, 300};
        int[] term2 = term1;
        System.out.println(term1 + " " + term2); // shallow copy
        term2[0] = 96;
        System.out.println(Arrays.toString(term1)); // {96, 200, 300}
        System.out.println(Arrays.toString(term2)); // {96, 200, 300}

        int[] term3 = {100, 200, 300};
        int[] term4 = term3.clone();
        System.out.println(term3 + " " + term4); // deep copy
        term4[0] = 96;
        System.out.println(Arrays.toString(term3)); // {100, 200, 300}
        System.out.println(Arrays.toString(term4)); // {96, 200, 300}
    }
}
