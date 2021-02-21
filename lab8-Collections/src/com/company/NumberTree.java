package com.company;

import java.util.TreeSet;

public class NumberTree extends TreeSet<Integer> {

    @Override
    public boolean add(Integer integer) {
        if (integer % 2 == 0) {
            return super.add(integer);
        }
        return false;
    }
}
