package com.qriosity.day12.inherit;

/**
 * @author Queue-ri
 */
public class Queue_ri extends Woman {
    String status;

    public Queue_ri(char gender, String name, int walk, String status) {
        super(gender, name, walk);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Queue_ri{" +
                "status='" + status + '\'' +
                ", walk=" + walk +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
