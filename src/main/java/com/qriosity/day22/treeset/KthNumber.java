package com.qriosity.day22.treeset;

import java.util.TreeSet;

/**
 * @author Queue-ri
 */
public class KthNumber {
    public static void main(String[] args) {
        // 'K번째 큰 수 작은 수' 유형: TreeSet 사용
        int[] n = {1, 12, 33, 6, 18, 9, 10, 10};
        TreeSet<Integer> tree = new TreeSet<>();
        for (int x: n){
            tree.add(x);
        }
        System.out.println(tree);
        System.out.println(tree.first());
        System.out.println(tree.last());

        Object[] arr = tree.toArray();
        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[arr.length - 2]);
        System.out.println(arr[arr.length - 3]);
        // k번째 큰 수라고 나오면 정렬된 상태에서
        // arr[arr.length - k]
    }
}
