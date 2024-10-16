package com.qriosity.day12.inherit;

/**
 * @author Queue-ri
 */
public class Woman extends Human {
    int walk;

    public Woman(char gender, String name, int walk) {
        super(gender, name);
        this.walk = walk;
    }
}
